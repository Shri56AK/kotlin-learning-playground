/*
====================================
KOTLIN CLASSES & OBJECTS — COMPLETE NOTES
====================================

Class = Blueprint

Object = Real instance created from class

Analogy:

Class → Cookie cutter
Object → Cookie created from cutter

A class defines:

- Properties
- Variables
- Functions
- Behavior
*/

fun main() {

    /*
    ====================================
    1. Creating Object
    ====================================
    */

    val worker1 = Worker(
        "Priya",
        "Maharashtra"
    )

    println("Worker Name: " + worker1.name)

    println("Worker Region: " + worker1.region)


    /*
    ====================================
    2. Calling Class Function
    ====================================
    */

    worker1.showInfo()


    /*
    ====================================
    3. Updating Mutable Property
    ====================================
    */

    worker1.totalXp += 50

    println("Updated XP: " + worker1.totalXp)


    /*
    ====================================
    4. Data Class
    ====================================
    */

    val points = WorkerPoints(
        workerId = "W001",
        totalXp = 150,
        streak = 5
    )

    println(points)


    /*
    ====================================
    5. Copy Function
    ====================================

    Creates new object with changes.
    */

    val updatedPoints = points.copy(
        totalXp = 250
    )

    println(updatedPoints)


    /*
    ====================================
    6. Equality Check
    ====================================
    */

    val p1 = WorkerPoints(
        "W001",
        100,
        3
    )

    val p2 = WorkerPoints(
        "W001",
        100,
        3
    )

    println("Equal Objects: " + (p1 == p2))


    /*
    ====================================
    7. Enum Class
    ====================================
    */

    val event = GamificationEvent.ANC_VISIT

    println("Event XP: " + event.xpValue)


    /*
    ====================================
    8. Singleton Object
    ====================================
    */

    println("Registration XP: " + XpConfig.REGISTRATION)


    /*
    ====================================
    9. Companion Object
    ====================================
    */

    println("Max XP: " + Worker.MAX_XP)
}


/*
====================================
Regular Class
====================================
*/

class Worker(

    val name: String,

    val region: String,

    var totalXp: Int = 0
) {

    /*
    init block runs when object created.
    */

    init {

        println("Worker Created")
    }

    /*
    Class Function
    */

    fun showInfo() {

        println("Name: " + name)

        println("Region: " + region)

        println("XP: " + totalXp)
    }

    /*
    Companion Object
    */

    companion object {

        const val MAX_XP = 1000
    }
}


/*
====================================
Data Class
====================================

Used for holding data.

Automatically gives:

- toString()
- equals()
- copy()
- hashCode()
*/

data class WorkerPoints(

    val workerId: String,

    val totalXp: Int = 0,

    val streak: Int = 0
)


/*
====================================
Enum Class
====================================

Fixed set of constants.
*/

enum class GamificationEvent(

    val xpValue: Int
) {

    REGISTRATION(10),

    ANC_VISIT(25),

    DELIVERY(50)
}


/*
====================================
Object Singleton
====================================

Only one instance exists.
*/

object XpConfig {

    const val REGISTRATION = 10

    const val VISIT = 25

    const val DELIVERY = 50
}


/*
====================================
SUMMARY
====================================

class → blueprint
object → real instance
data class → stores data
enum class → fixed constants
companion object → static-like values
object → singleton
copy() → clone object
== → value comparison
*/
