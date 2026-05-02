/*
====================================
DEPENDENCY INJECTION — COMPLETE NOTES
====================================

Dependency Injection = DI

DI provides required objects automatically.

Without DI:

Class creates its own dependencies.

With DI:

Dependencies are provided externally.

Goal:

- Reduce coupling
- Improve testing
- Improve scalability
- Better architecture
*/


/*
====================================
DEPENDENCY EXAMPLE
====================================

Dependency = Object another class needs.

Example:

ViewModel needs Repository.

Repository = dependency.
*/


/*
====================================
WITHOUT DEPENDENCY INJECTION
====================================

Problem:

Class tightly controls dependency.
*/

class WithoutDI {

    private val repository = WorkerRepository()

    fun loadData() {

        repository.getWorkers()
    }
}


/*
====================================
WITH DEPENDENCY INJECTION
====================================

Dependency provided externally.
*/

class WithDI(

    private val repository: WorkerRepository
) {

    fun loadData() {

        repository.getWorkers()
    }
}


/*
====================================
WHY DI IMPORTANT
====================================

Benefits:

- Easier testing
- Replace dependencies easily
- Cleaner code
- Better modularity
- Scalable architecture
*/


/*
====================================
DEPENDENCY TYPES
====================================

1. Constructor Injection
2. Field Injection
3. Method Injection
*/


/*
====================================
1. Constructor Injection
====================================

Most common.

Dependency passed via constructor.
*/

class WorkerViewModel(

    private val repository: WorkerRepository
)


/*
====================================
2. Field Injection
====================================

Dependency assigned later.
*/

class AnalyticsManager {

    lateinit var logger: Logger
}


/*
====================================
3. Method Injection
====================================

Dependency passed to function.
*/

class UploadManager {

    fun upload(

        repository: WorkerRepository
    ) {

        repository.getWorkers()
    }
}


/*
====================================
HILT
====================================

Hilt = Android DI library.

Built on top of Dagger.

Automates dependency injection.
*/


/*
====================================
HILT ANNOTATIONS
====================================

@HiltAndroidApp
@Module
@Provides
@Inject
@InstallIn
*/


/*
====================================
APPLICATION CLASS
====================================
*/

@dagger.hilt.android.HiltAndroidApp

class MyApplication


/*
====================================
INJECT DEPENDENCY
====================================
*/

class WorkerRepository {

    fun getWorkers() {

        println("Loading Workers")
    }
}


class WorkerViewModelDI @javax.inject.Inject constructor(

    private val repository: WorkerRepository
)


/*
====================================
MODULE
====================================

Provides dependencies.
*/

@dagger.Module

@dagger.hilt.InstallIn(

    dagger.hilt.components.SingletonComponent::class
)

object RepositoryModule {

    @dagger.Provides

    fun provideRepository(): WorkerRepository {

        return WorkerRepository()
    }
}


/*
====================================
WHY HILT?
====================================

Hilt automatically:

- Creates dependencies
- Injects objects
- Manages lifecycle
*/


/*
====================================
FLW CONNECTION
====================================

FLW uses Hilt because:

- Repository injection
- Room injection
- Modular architecture
- Easier testing
*/


/*
====================================
IMPORTANT RULES
====================================

1. Avoid creating dependencies manually
2. Use constructor injection
3. Keep modules organized
4. DI improves testing
*/


/*
====================================
SUMMARY
====================================

Dependency → required object
Injection → external supply
DI → decouples classes
Hilt → Android DI framework
@Inject → inject dependency
@Module → provider container
@Provides → dependency creator

DI is essential Android skill.
*/
