/*
====================================
KOTLIN CONTROL FLOW — COMPLETE NOTES
====================================

Control Flow decides:

- What code runs
- When code runs
- How many times code runs

Control flow includes:

1. if
2. if-else
3. if as expression
4. when
5. ranges
6. loops
7. break
8. continue
*/

fun main() {

    /*
    ====================================
    1. Basic If Statement
    ====================================
    */

    val score = 85

    if (score >= 50) {
        println("Passed")
    }


    /*
    ====================================
    2. If Else
    ====================================
    */

    val age = 20

    if (age >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }


    /*
    ====================================
    3. If Else If
    ====================================
    */

    val marks = 72

    if (marks >= 90) {
        println("Grade A")
    } else if (marks >= 75) {
        println("Grade B")
    } else if (marks >= 50) {
        println("Grade C")
    } else {
        println("Fail")
    }


    /*
    ====================================
    4. If As Expression
    ====================================

    Kotlin if can return value.
    */

    val xp = 150

    val level = if (xp >= 100) {
        "Senior"
    } else {
        "Junior"
    }

    println("Level: " + level)


    /*
    ====================================
    5. When Statement
    ====================================

    Better alternative to switch.
    */

    val day = "Monday"

    when (day) {

        "Monday", "Tuesday" -> {
            println("Start Of Week")
        }

        "Wednesday" -> {
            println("Middle Of Week")
        }

        "Friday" -> {
            println("Almost Weekend")
        }

        else -> {
            println("Weekend")
        }
    }


    /*
    ====================================
    6. When As Expression
    ====================================
    */

    val totalXp = 300

    val workerLevel = when {

        totalXp >= 1000 -> "Expert"

        totalXp >= 500 -> "Advanced"

        totalXp >= 200 -> "Intermediate"

        else -> "Beginner"
    }

    println("Worker Level: " + workerLevel)


    /*
    ====================================
    7. Range Operator
    ====================================
    */

    for (i in 1..5) {
        println("Range Value: " + i)
    }


    /*
    ====================================
    8. Until Range
    ====================================

    Excludes ending value.
    */

    for (i in 1 until 5) {
        println("Until Value: " + i)
    }


    /*
    ====================================
    9. DownTo Range
    ====================================
    */

    for (i in 5 downTo 1) {
        println("Countdown: " + i)
    }


    /*
    ====================================
    10. Step
    ====================================
    */

    for (i in 0..10 step 2) {
        println("Step Value: " + i)
    }


    /*
    ====================================
    11. Loop Through List
    ====================================
    */

    val workers = listOf(
        "Priya",
        "Asha",
        "Meera"
    )

    for (worker in workers) {
        println("Worker: " + worker)
    }


    /*
    ====================================
    12. Loop With Index
    ====================================
    */

    for ((index, worker) in workers.withIndex()) {

        println("Index: " + index)

        println("Name: " + worker)
    }


    /*
    ====================================
    13. While Loop
    ====================================
    */

    var count = 1

    while (count <= 5) {

        println("Count: " + count)

        count++
    }


    /*
    ====================================
    14. Do While Loop
    ====================================
    */

    var number = 1

    do {

        println("Do While Number: " + number)

        number++

    } while (number <= 3)


    /*
    ====================================
    15. Break Statement
    ====================================

    Stops loop completely.
    */

    for (i in 1..10) {

        if (i == 5) {
            break
        }

        println("Break Loop: " + i)
    }


    /*
    ====================================
    16. Continue Statement
    ====================================

    Skips current iteration.
    */

    for (i in 1..5) {

        if (i == 3) {
            continue
        }

        println("Continue Loop: " + i)
    }
}


/*
====================================
SUMMARY
====================================

if → decision making
if else → alternate choice
if expression → returns value
when → advanced switch
range → sequence of values
for → repeat loop
while → condition loop
break → stop loop
continue → skip iteration
*/
