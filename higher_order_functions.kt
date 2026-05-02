/*
====================================
KOTLIN HIGHER-ORDER FUNCTIONS
& LAMBDAS — COMPLETE NOTES
====================================

This file covers:

1. Lambda Functions
2. Function Types
3. Higher-Order Functions
4. Passing Function As Parameter
5. it Keyword
6. Trailing Lambda Syntax
7. Collection Operations
8. filter
9. map
10. forEach
11. any / all / none
12. first / find
13. sumOf
14. sortedBy

Used heavily in:

- Android Kotlin
- RecyclerView lists
- Flow
- Room Database
- MVVM
- Data transformations
*/

fun main() {

    /*
    ====================================
    1. Basic Lambda
    ====================================
    */

    val double = { x: Int -> x * 2 }

    println("Double Value: " + double(5))


    /*
    ====================================
    2. Lambda With Explicit Type
    ====================================
    */

    val greet: (String) -> String = {

        name -> "Hello " + name
    }

    println(greet("Priya"))


    /*
    ====================================
    3. Lambda With it Keyword
    ====================================
    */

    val square: (Int) -> Int = {

        it * it
    }

    println("Square: " + square(4))


    /*
    ====================================
    4. Lambda With Multiple Parameters
    ====================================
    */

    val add: (Int, Int) -> Int = {

        a, b -> a + b
    }

    println("Addition: " + add(10, 20))


    /*
    ====================================
    5. Higher Order Function
    ====================================
    */

    val result = applyTwice(3) {

        it * 2
    }

    println("Apply Twice Result: " + result)


    /*
    ====================================
    6. Collection Data
    ====================================
    */

    val scores = listOf(

        10,
        20,
        30,
        40,
        50
    )


    /*
    ====================================
    7. filter
    ====================================

    Keeps matching values.
    */

    val filtered = scores.filter {

        it > 25
    }

    println("Filtered Values: " + filtered)


    /*
    ====================================
    8. map
    ====================================

    Transforms values.
    */

    val doubled = scores.map {

        it * 2
    }

    println("Mapped Values: " + doubled)


    /*
    ====================================
    9. forEach
    ====================================
    */

    scores.forEach {

        println("Score: " + it)
    }


    /*
    ====================================
    10. any
    ====================================

    True if ANY match exists.
    */

    println(

        "Any Above 40: " +

        scores.any {

            it > 40
        }
    )


    /*
    ====================================
    11. all
    ====================================

    True if ALL match.
    */

    println(

        "All Above 5: " +

        scores.all {

            it > 5
        }
    )


    /*
    ====================================
    12. none
    ====================================

    True if NONE match.
    */

    println(

        "None Above 100: " +

        scores.none {

            it > 100
        }
    )


    /*
    ====================================
    13. first
    ====================================

    Gets first matching item.
    */

    val firstLarge = scores.first {

        it > 20
    }

    println("First Above 20: " + firstLarge)


    /*
    ====================================
    14. sumOf
    ====================================
    */

    val total = scores.sumOf {

        it
    }

    println("Total Sum: " + total)


    /*
    ====================================
    15. sortedBy
    ====================================
    */

    val sorted = scores.sortedBy {

        it
    }

    println("Sorted Values: " + sorted)
}


/*
====================================
HIGHER-ORDER FUNCTION
====================================

Takes another function as parameter.
*/

fun applyTwice(

    x: Int,

    operation: (Int) -> Int

): Int {

    return operation(operation(x))
}


/*
====================================
TRAILING LAMBDA SYNTAX
====================================

If lambda is last parameter,
it can move outside parentheses.

Example:

applyTwice(3) { it * 2 }
*/


/*
====================================
FUNCTION TYPE FORMAT
====================================

(Int) -> String

Meaning:

Input = Int
Output = String
*/


/*
====================================
SUMMARY
====================================

lambda → anonymous function
higher-order function → takes function input
it → implicit parameter
filter → keep matching values
map → transform values
forEach → loop collection
any → check any match
all → check all match
none → check none match
sumOf → total values
sortedBy → sort values

These are heavily used in Android.
*/
