/*
====================================
KOTLIN VARIABLES & TYPES — COMPLETE NOTES
====================================

This file covers:

1. val vs var
2. Type inference
3. Explicit types
4. Nullable types
5. Safe call operator
6. Elvis operator
7. Unsafe null operator
8. String templates
9. Expressions inside strings
10. Kotlin crash prevention basics
*/

fun main() {

    /*
    ====================================
    1. val vs var
    ====================================

    val = immutable (cannot change)
    var = mutable (can change)

    Rule:
    Always prefer val unless value must change.
    */

    // Immutable variable
    val name = "Priya"
    val age = 25
    val xp = 100

    println("Name: " + name)
    println("Age: " + age)
    println("XP: " + xp)

    // name = "Asha" ❌ ERROR
    // val cannot be reassigned


    /*
    ====================================
    Mutable Variable
    ====================================
    */

    var score = 0

    println("Initial Score: " + score)

    score = 10
    println("Updated Score: " + score)

    score = 150
    println("Final Score: " + score)


    /*
    ====================================
    2. Type Inference
    ====================================

    Kotlin automatically detects type.
    */

    val country = "India"     // String
    val level = 3             // Int
    val height = 5.7          // Double
    val active = true         // Boolean

    println("Country: " + country)
    println("Level: " + level)
    println("Height: " + height)
    println("Active: " + active)


    /*
    ====================================
    3. Explicit Type Declaration
    ====================================

    Sometimes we define type manually.
    */

    val city: String = "Pune"
    val price: Double = 99.99
    val isStudent: Boolean = true

    println("City: " + city)
    println("Price: " + price)
    println("Student: " + isStudent)


    /*
    ====================================
    4. Nullable Types
    ====================================

    Kotlin prevents null crashes.

    By default:
    Variables CANNOT be null.
    */

    var workerName: String = "Asha"

    println("Worker Name: " + workerName)

    // workerName = null ❌ ERROR


    /*
    Nullable variable
    Add ? to allow null.
    */

    var nickname: String? = null

    println("Nickname: " + nickname)


    /*
    ====================================
    5. Safe Call Operator ?.
    ====================================

    Prevents crash if value is null.
    */

    val nicknameLength = nickname?.length

    println("Nickname Length: " + nicknameLength)


    /*
    ====================================
    6. Elvis Operator ?:
    ====================================

    Provides default value if null.
    */

    val safeLength = nickname?.length ?: 0

    println("Safe Length: " + safeLength)


    /*
    ====================================
    7. Unsafe Operator !!
    ====================================

    Forces value to be non-null.

    Dangerous.
    Can crash app.
    */

    // val crashLength = nickname!!.length ❌

    /*
    Avoid !! in production code.
    */


    /*
    ====================================
    8. String Templates
    ====================================

    String templates use $ to insert
    variables directly into text.
    */

    val workerXp = 150

    // Example using $
    println("Worker XP: $workerXp")


    /*
    ====================================
    9. Expressions Inside String
    ====================================

    Use ${} for calculations or logic.
    */

    // Example using ${}
    println("XP Needed For Next Level: ${200 - workerXp}")


    /*
    ====================================
    10. Conditional Expression
    ====================================

    Expressions can also include if/else.
    */

    println(
        "Worker Status: ${
            if (workerXp > 100) "Senior"
            else "Junior"
        }"
    )


    /*
    ====================================
    Summary
    ====================================

    val → immutable
    var → mutable
    ? → nullable
    ?. → safe call
    ?: → default value
    !! → unsafe force
    $ → string template
    ${} → expression inside string
    */
}
