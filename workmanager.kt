/*
====================================
WORKMANAGER — COMPLETE NOTES
====================================

WorkManager = Background Task Scheduler

Used for:

- Background uploads
- Sync data
- Retry failed tasks
- Offline queue processing
- Notifications
- Scheduled work

WorkManager guarantees task execution.

Even if:

- App closes
- Phone restarts
- App removed from memory
*/


/*
====================================
WHEN TO USE WORKMANAGER
====================================

Use WorkManager for:

- Upload pending data
- Sync local database
- Retry failed API calls
- Daily reminders
- Background analytics
*/


/*
====================================
Required Imports
====================================
*/

import android.content.Context
import androidx.work.*


/*
====================================
1. Worker Class
====================================

Worker performs background task.
*/

class UploadWorker(

    context: Context,

    params: WorkerParameters

) : Worker(context, params) {

    override fun doWork(): Result {

        println("Uploading Data")

        /*
        Work result options:

        Result.success()
        Result.failure()
        Result.retry()
        */

        return Result.success()
    }
}


/*
====================================
2. One-Time Work Request
====================================

Runs once.
*/

fun createOneTimeWork() {

    val uploadWork = OneTimeWorkRequestBuilder<UploadWorker>()

        .build()

    /*
    Queue work
    */

    WorkManager

        .getInstance()

        .enqueue(uploadWork)
}


/*
====================================
3. Periodic Work Request
====================================

Repeats automatically.
*/

fun createPeriodicWork() {

    val syncWork =

        PeriodicWorkRequestBuilder<UploadWorker>(

            15,

            java.util.concurrent.TimeUnit.MINUTES
        )

            .build()

    WorkManager

        .getInstance()

        .enqueue(syncWork)
}


/*
====================================
4. Passing Input Data
====================================
*/

fun inputDataExample() {

    val input = Data.Builder()

        .putString("workerId", "W001")

        .build()

    val request = OneTimeWorkRequestBuilder<UploadWorker>()

        .setInputData(input)

        .build()
}


/*
====================================
5. Reading Input Data
====================================
*/

class InputWorker(

    context: Context,

    params: WorkerParameters

) : Worker(context, params) {

    override fun doWork(): Result {

        val workerId =

            inputData.getString("workerId")

        println("Worker ID: " + workerId)

        return Result.success()
    }
}


/*
====================================
6. Constraints
====================================

Conditions before work runs.
*/

fun constrainedWork() {

    val constraints = Constraints.Builder()

        .setRequiredNetworkType(

            NetworkType.CONNECTED
        )

        .build()

    val request = OneTimeWorkRequestBuilder<UploadWorker>()

        .setConstraints(constraints)

        .build()
}


/*
====================================
7. Chained Work
====================================

Run tasks in sequence.
*/

fun chainedWork() {

    val upload =

        OneTimeWorkRequestBuilder<UploadWorker>()

            .build()

    val sync =

        OneTimeWorkRequestBuilder<InputWorker>()

            .build()

    WorkManager

        .getInstance()

        .beginWith(upload)

        .then(sync)

        .enqueue()
}


/*
====================================
8. Retry Work
====================================
*/

class RetryWorker(

    context: Context,

    params: WorkerParameters

) : Worker(context, params) {

    override fun doWork(): Result {

        val success = false

        return if (success) {

            Result.success()

        } else {

            Result.retry()
        }
    }
}


/*
====================================
9. Work States
====================================

WorkInfo states:

ENQUEUED
RUNNING
SUCCEEDED
FAILED
CANCELLED
BLOCKED
*/


/*
====================================
10. Cancel Work
====================================
*/

fun cancelWork() {

    WorkManager

        .getInstance()

        .cancelAllWork()
}


/*
====================================
11. Unique Work
====================================

Avoid duplicate tasks.
*/

fun uniqueWork() {

    val request =

        OneTimeWorkRequestBuilder<UploadWorker>()

            .build()

    WorkManager

        .getInstance()

        .enqueueUniqueWork(

            "sync_worker",

            ExistingWorkPolicy.REPLACE,

            request
        )
}


/*
====================================
12. FLW CONNECTION
====================================

FLW uses WorkManager for:

- Offline sync
- Retry upload
- Background queue
- Data consistency
- Scheduled uploads
*/


/*
====================================
13. Important Rules
====================================

Use WorkManager when:

- Work must survive app close
- Task must retry
- Background sync needed
- Reliable execution needed
*/


/*
====================================
SUMMARY
====================================

Worker → background task
doWork() → task logic
OneTimeWorkRequest → run once
PeriodicWorkRequest → repeat
Constraints → requirements
Result.success() → success
Result.retry() → retry
Result.failure() → failed
enqueue() → schedule work

WorkManager is core Android skill.
*/
