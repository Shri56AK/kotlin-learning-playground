/*
====================================
KOTLIN COLLECTIONS — COMPLETE NOTES
====================================

Collections store multiple values.

Types of Collections:

1. List
2. MutableList
3. Set
4. MutableSet
5. Map
6. MutableMap

Collections are heavily used in:

- Android apps
- API responses
- Database records
- RecyclerViews
- User data
*/

fun main() {

    /*
    ====================================
    1. List
    ====================================

    Ordered collection.
    Read-only by default.
    */

    val workers = listOf(
        "Priya",
        "Asha",
        "Meera"
    )

    println("Workers List: " + workers)

    println("First Worker: " + workers[0])

    println("Total Workers: " + workers.size)


    /*
    ====================================
    2. Loop Through List
    ====================================
    */

    for (worker in workers) {
        println("Worker Name: " + worker)
    }


    /*
    ====================================
    3. MutableList
    ====================================

    Allows add/remove/update.
    */

    val tasks = mutableListOf(
        "Visit House",
        "Vaccination"
    )

    println("Tasks Before: " + tasks)

    tasks.add("Health Checkup")

    println("Tasks After Add: " + tasks)

    tasks.remove("Vaccination")

    println("Tasks After Remove: " + tasks)


    /*
    ====================================
    4. Update Mutable List
    ====================================
    */

    tasks[0] = "Pregnancy Visit"

    println("Updated Tasks: " + tasks)


    /*
    ====================================
    5. Set
    ====================================

    Stores unique values only.
    No duplicates.
    */

    val villages = setOf(
        "Pune",
        "Mumbai",
        "Pune"
    )

    println("Villages Set: " + villages)


    /*
    ====================================
    6. MutableSet
    ====================================
    */

    val badges = mutableSetOf(
        "Starter",
        "Active Worker"
    )

    badges.add("Gold Badge")

    println("Badges: " + badges)


    /*
    ====================================
    7. Map
    ====================================

    Stores key-value pairs.
    */

    val worker = mapOf(

        "name" to "Priya",
        "region" to "Maharashtra",
        "level" to "Senior"
    )

    println("Worker Map: " + worker)

    println("Worker Name: " + worker["name"])


    /*
    ====================================
    8. MutableMap
    ====================================
    */

    val points = mutableMapOf(

        "Priya" to 100,
        "Asha" to 150
    )

    println("Points Before: " + points)

    points["Meera"] = 200

    println("Points After Add: " + points)


    /*
    ====================================
    9. Update Map Value
    ====================================
    */

    points["Priya"] = 300

    println("Updated Points: " + points)


    /*
    ====================================
    10. Remove Map Value
    ====================================
    */

    points.remove("Asha")

    println("Points After Remove: " + points)


    /*
    ====================================
    11. Collection Functions
    ====================================
    */

    val scores = listOf(
        10,
        20,
        30,
        40
    )

    println("Count: " + scores.count())

    println("Max: " + scores.maxOrNull())

    println("Min: " + scores.minOrNull())

    println("Sum: " + scores.sum())


    /*
    ====================================
    12. Filter
    ====================================
    */

    val filtered = scores.filter {

        it > 20
    }

    println("Filtered Scores: " + filtered)


    /*
    ====================================
    13. Map Function
    ====================================

    Transform values.
    */

    val doubled = scores.map {

        it * 2
    }

    println("Doubled Scores: " + doubled)


    /*
    ====================================
    14. forEach
    ====================================
    */

    workers.forEach {

        println("Worker Using forEach: " + it)
    }


    /*
    ====================================
    15. Contains
    ====================================
    */

    println("Contains Priya: " + workers.contains("Priya"))

    println("Contains Ravi: " + workers.contains("Ravi"))
}


/*
====================================
SUMMARY
====================================

List → ordered values
MutableList → editable list
Set → unique values
Map → key-value data
filter → remove unwanted values
map → transform values
forEach → loop collection
contains → check existence
*/
