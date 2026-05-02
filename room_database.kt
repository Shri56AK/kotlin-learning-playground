/*
====================================
ROOM DATABASE — COMPLETE NOTES
====================================

Room = Local Database Library

Used for:

- Offline storage
- Persistent data
- Android databases
- Cached API data
- Sync architecture

Room Components:

1. Entity
2. DAO
3. Database
4. Repository
5. ViewModel connection

Flow:

UI
↓
ViewModel
↓
Repository
↓
DAO
↓
Room Database
*/


/*
====================================
Required Imports
====================================
*/

import androidx.room.*
import kotlinx.coroutines.flow.Flow


/*
====================================
1. ENTITY
====================================

Entity = Database Table

Each object = One row.
*/

@Entity(tableName = "workers")

data class WorkerEntity(

    @PrimaryKey(autoGenerate = true)

    val id: Int = 0,

    val name: String,

    val village: String,

    val totalXp: Int
)


/*
====================================
2. DAO
====================================

DAO = Data Access Object

Handles queries.
*/

@Dao
interface WorkerDao {

    /*
    Insert Worker
    */

    @Insert
    suspend fun insertWorker(

        worker: WorkerEntity
    )


    /*
    Update Worker
    */

    @Update
    suspend fun updateWorker(

        worker: WorkerEntity
    )


    /*
    Delete Worker
    */

    @Delete
    suspend fun deleteWorker(

        worker: WorkerEntity
    )


    /*
    Get All Workers
    */

    @Query("SELECT * FROM workers")

    fun getWorkers(): Flow<List<WorkerEntity>>


    /*
    Get Worker By ID
    */

    @Query("SELECT * FROM workers WHERE id = :workerId")

    suspend fun getWorkerById(

        workerId: Int
    ): WorkerEntity?
}


/*
====================================
3. DATABASE
====================================

Database holds DAOs.
*/

@Database(

    entities = [

        WorkerEntity::class

    ],

    version = 1
)

abstract class AppDatabase : RoomDatabase() {

    abstract fun workerDao(): WorkerDao
}


/*
====================================
4. Repository Layer
====================================

Repository separates data logic.
*/

class WorkerRepository(

    private val dao: WorkerDao
) {

    fun getWorkers(): Flow<List<WorkerEntity>> {

        return dao.getWorkers()
    }

    suspend fun insertWorker(

        worker: WorkerEntity
    ) {

        dao.insertWorker(worker)
    }
}


/*
====================================
5. ViewModel Usage
====================================

ViewModel talks to Repository.
*/

class WorkerViewModel(

    private val repository: WorkerRepository
) {

    fun observeWorkers(): Flow<List<WorkerEntity>> {

        return repository.getWorkers()
    }
}


/*
====================================
6. Example Worker Data
====================================
*/

val sampleWorker = WorkerEntity(

    name = "Priya",

    village = "Pune",

    totalXp = 200
)


/*
====================================
7. Room Relationships
====================================

Room supports relationships.

Examples:

One Worker → Many Visits
One Worker → Many Badges
*/


/*
====================================
8. Common Room Annotations
====================================

@Entity → table
@Dao → query layer
@Insert → insert data
@Update → update row
@Delete → delete row
@Query → custom SQL
@Database → database holder
*/


/*
====================================
9. Why Room Is Important
====================================

Room provides:

- Compile-time query checking
- Kotlin coroutine support
- Flow support
- Offline storage
- Better SQLite handling
*/


/*
====================================
10. FLW Connection
====================================

FLW uses Room because:

- Offline-first
- Health data persistence
- Sync queue
- Local caching
- Background upload
*/


/*
====================================
SUMMARY
====================================

Entity → table
DAO → database operations
Database → holds DAOs
Repository → business logic
Flow → live updates
Room → local persistence

Room is essential Android skill.
*/
