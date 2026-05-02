/*
====================================
KOTLIN FUNCTIONS — COMPLETE NOTES
====================================

Functions are reusable blocks of code.

Why use functions?

- Avoid repeating code
- Make code cleaner
- Organize logic
- Break large problems into small parts
- Improve readability
- Reuse same logic multiple times

Analogy:

A function is like a recipe.

Recipe Name → Function Name
Ingredients → Parameters
Finished Dish → Return Value
*/

fun main() {

    /*
    ====================================
    1. Calling A Basic Function
    ====================================
    */

    greet()


    /*
    ====================================
    2. Function With Parameter
    ====================================

    Parameter = input passed into function
    */

    greetUser("Priya")
    greetUser("Asha")


    /*
    ====================================
    3. Function Returning Value
    ====================================

    Return sends value back.
    */

    val total = addNumbers(10, 20)

    println("Addition Result: " + total)


    /*
    ====================================
    4. Function With Multiple Parameters
    ====================================
    */

    val result = multiplyNumbers(5, 4)

    println("Multiplication Result: " + result)


    /*
    ====================================
    5. Default Parameters
    ====================================

    Function uses default value if input missing.
    */

    createWorker("Priya")
    createWorker("Asha", "Gujarat")
    createWorker("Meera", "Assam", 3)


    /*
    ====================================
    6. Named Arguments
    ====================================

    Allows passing arguments by name.

    Order does not matter.
    */

    createWorker(
        level = 2,
        name = "Kavya"
    )


    /*
    ====================================
    7. Short Function Syntax
    ====================================

    Single-expression function.
    */

    val doubled = doubleNumber(6)

    println("Double Value: " + doubled)


    /*
    ====================================
    8. Function Using When Expression
    ====================================
    */

    val workerLevel = levelName(600)

    println("Worker Level: " + workerLevel)


    /*
    ====================================
    9. Unit Return Type
    ====================================

    Unit means function returns nothing.
    Similar to void in Java.
    */

    printMessage("Learning Kotlin Functions")


    /*
    ====================================
    10. String Templates In Functions
    ====================================

    Use $ to insert variables.
    */

    val welcome = welcomeUser("Shristy")

    println(welcome)
}


/*
====================================
Basic Function
====================================

No parameter
No return value
*/

fun greet() {
    println("Hello Kotlin")
}


/*
====================================
Function With Parameter
====================================

Parameter receives input.
*/

fun greetUser(name: String) {
    println("Hello " + name)
}


/*
====================================
Function Returning Value
====================================

Return type comes after :
*/

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}


/*
====================================
Multiple Parameters
====================================
*/

fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}


/*
====================================
Default Parameters
====================================

Allows optional values.
*/

fun createWorker(
    name: String,
    region: String = "Maharashtra",
    level: Int = 1
) {

    println(
        "Worker: " + name +
        " | Region: " + region +
        " | Level: " + level
    )
}


/*
====================================
Named Arguments
====================================

Improves readability.
*/


/*
====================================
Short Function Syntax
====================================

Single-expression function.

Instead of:

return x * 2
*/

fun doubleNumber(x: Int): Int = x * 2


/*
====================================
Function Using When
====================================
*/

fun levelName(xp: Int): String = when {

    xp >= 1000 -> "Expert"

    xp >= 500 -> "Senior"

    else -> "Junior"
}


/*
====================================
Unit Return Type
====================================

Returns nothing.
*/

fun printMessage(message: String): Unit {
    println(message)
}


/*
====================================
Function Returning String
====================================

Uses String Templates.
*/

fun welcomeUser(name: String): String {

    return "Welcome $name"
}


/*
====================================
SUMMARY
====================================

fun → keyword to create function
parameter → input value
return → sends value back
Unit → no return value
default parameter → fallback value
named argument → argument by name
= → shorthand function syntax
when → expression inside function

Functions are one of the most used
features in Kotlin. :contentReference[oaicite:0]{index=0}
*/
