/*
====================================
MVVM ARCHITECTURE — COMPLETE NOTES
====================================

MVVM = Model View ViewModel

Modern Android architecture.

Used heavily in:

- Android Apps
- Room Database
- Repository Pattern
- FLW App
- Jetpack Architecture

Goal:

Separate responsibilities.

Without MVVM:

UI + Logic + Database mixed.

With MVVM:

Clean separation.
*/


/*
====================================
MVVM FLOW
====================================

View
↓
ViewModel
↓
Repository
↓
Database / API
*/


/*
====================================
1. MODEL
====================================

Model = Data Layer

Contains:

- Entity
- API models
- Database objects
*/

data class WorkerModel(

    val id: Int,

    val name: String,

    val xp: Int
)


/*
====================================
2. VIEW
====================================

View = UI Layer

Examples:

- Activity
- Fragment
- Compose Screen

View should:

- Show UI
- Observe ViewModel
- Handle clicks

View should NOT:

- Call database directly
- Hold business logic
*/


/*
====================================
3. VIEWMODEL
====================================

ViewModel handles:

- UI state
- Business logic
- Data preparation
- Coroutines
*/

class WorkerViewModel(

    private val repository: WorkerRepository
) {

    /*
    Observe Workers
    */

    fun getWorkers() = repository.getWorkers()


    /*
    Add Worker
    */

    suspend fun addWorker(

        worker: WorkerModel
    ) {

        repository.insertWorker(worker)
    }
}


/*
====================================
4. REPOSITORY
====================================

Repository acts as middle layer.

Repository decides:

- Local database?
- API?
- Cache?
*/

class WorkerRepository {

    /*
    Simulated Database
    */

    private val workerList = mutableListOf<WorkerModel>()


    fun getWorkers(): List<WorkerModel> {

        return workerList
    }


    fun insertWorker(

        worker: WorkerModel
    ) {

        workerList.add(worker)
    }
}


/*
====================================
5. VIEW EXAMPLE
====================================

Activity/Fragment observes ViewModel.
*/

fun displayWorkers() {

    val repository = WorkerRepository()

    val viewModel = WorkerViewModel(repository)

    println(viewModel.getWorkers())
}


/*
====================================
6. WHY MVVM?
====================================

Benefits:

- Cleaner code
- Easier testing
- Better scalability
- Separation of concerns
- Lifecycle safe
*/


/*
====================================
7. MVVM RESPONSIBILITIES
====================================

View:

- UI only

ViewModel:

- Logic
- State

Repository:

- Data source

Model:

- Data object
*/


/*
====================================
8. FLW CONNECTION
====================================

FLW architecture uses:

Fragment
↓
ViewModel
↓
Repository
↓
Room Database
↓
WorkManager Sync
*/


/*
====================================
9. Common Android MVVM Stack
====================================

UI Layer:
- Fragment
- Activity
- Compose

Logic Layer:
- ViewModel

Data Layer:
- Repository
- Room
- Retrofit
*/


/*
====================================
10. Common Mistakes
====================================

Bad:

Activity → Database directly

Good:

Activity → ViewModel → Repository
*/


/*
====================================
SUMMARY
====================================

Model → data
View → UI
ViewModel → logic
Repository → data access
MVVM → clean architecture

MVVM is core Android skill.
*/
