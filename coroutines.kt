/*
====================================
KOTLIN COROUTINES — COMPLETE NOTES
====================================

Coroutines allow asynchronous programming.

Meaning:

Run long tasks without blocking app.

Without coroutines:

- App freezes
- UI becomes slow
- ANR errors happen

Used heavily in:

- Android
- Room Database
- Retrofit APIs
- WorkManager
- Firebase
- FLW sync architecture

Analogy:

Normal Function → Waits for completion
Coroutine → Can pause and resume
*/


/*
====================================
Required Imports
====================================
*/

import kotlinx.coroutines.*


fun main() = runBlocking {

    /*
    ====================================
    1. Basic Coroutine
    ====================================
    */

    println("Program Started")

    launch {

        delay(2000)

        println("Coroutine Finished")
    }

    println("Main Continues")

    delay(3000)


    /*
    ====================================
    2. launch Builder
    ====================================

    launch returns Job.

    Used when no result needed.
    */

    val job = launch {

        delay(1000)

        println("Launch Completed")
    }

    job.join()


    /*
    ====================================
    3. async Builder
    ====================================

    async returns Deferred.

    Used when result needed.
    */

    val deferred = async {

        delay(1500)

        100 + 200
    }

    println("Async Result: " + deferred.await())


    /*
    ====================================
    4. suspend Function
    ====================================

    suspend allows pause/resume.
    */

    fetchWorkerData()


    /*
    ====================================
    5. CoroutineScope
    ====================================
    */

    coroutineScope {

        launch {

            println("Child Coroutine")
        }
    }


    /*
    ====================================
    6. Dispatcher
    ====================================

    Controls thread selection.
    */

    launch(Dispatchers.Default) {

        println("Running On Background Thread")
    }

    launch(Dispatchers.IO) {

        println("Running On IO Thread")
    }

    launch(Dispatchers.Main) {

        println("Running On Main Thread")
    }


    /*
    ====================================
    7. Parallel Coroutines
    ====================================
    */

    val worker1 = async {

        delay(1000)

        "Worker Data"
    }

    val worker2 = async {

        delay(1500)

        "XP Data"
    }

    println(worker1.await())

    println(worker2.await())


    /*
    ====================================
    8. Cancellation
    ====================================
    */

    val task = launch {

        repeat(5) {

            delay(1000)

            println("Running: " + it)
        }
    }

    delay(2500)

    task.cancel()

    println("Task Cancelled")


    /*
    ====================================
    9. Timeout
    ====================================
    */

    withTimeoutOrNull(2000) {

        repeat(5) {

            delay(1000)

            println("Timeout Running")
        }
    }


    /*
    ====================================
    10. Structured Concurrency
    ====================================

    Child coroutines tied to parent.
    */

    coroutineScope {

        launch {

            delay(1000)

            println("Child 1")
        }

        launch {

            delay(1500)

            println("Child 2")
        }
    }
}


/*
====================================
Suspend Function
====================================

Can pause execution.
*/

suspend fun fetchWorkerData() {

    delay(1000)

    println("Worker Data Loaded")
}


/*
====================================
DISPATCHERS
====================================

Main → UI thread
IO → Database / Network
Default → CPU work
Unconfined → Special use
*/


/*
====================================
launch vs async
====================================

launch → no result
async → returns value
*/


/*
====================================
IMPORTANT RULES
====================================

1. delay() replaces Thread.sleep()
2. suspend functions call suspend
3. launch = fire and forget
4. async = return result
5. Coroutines prevent UI blocking
*/


/*
====================================
SUMMARY
====================================

runBlocking → starts coroutine
launch → coroutine without result
async → coroutine with result
await → wait for async result
delay → suspend without blocking
suspend → pausable function
Dispatcher → thread selection
Job → coroutine handle
cancel → stop coroutine
timeout → limit execution time

Coroutines are core Android skill.
*/
