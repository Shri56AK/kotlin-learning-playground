/*
====================================
KOTLIN INTERFACES & INHERITANCE
COMPLETE NOTES
====================================

This file covers:

1. Interface
2. Interface Implementation
3. Default Methods
4. Inheritance
5. open Keyword
6. override Keyword
7. Parent Class
8. Child Class
9. Extension Functions
10. Extension Properties

These concepts are heavily used in:

- Android MVVM
- Repository Pattern
- Dependency Injection
- Clean Architecture
- FLW App Structure
*/

fun main() {

    /*
    ====================================
    1. Interface Implementation
    ====================================
    */

    val repository = GamificationRepositoryImpl()

    repository.insertEvent("HOUSEHOLD_REGISTRATION")

    repository.logEvent("ANC_VISIT")


    /*
    ====================================
    2. Inheritance Example
    ====================================
    */

    val dog = Dog("Bruno")

    println("Dog Name: " + dog.name)

    println("Dog Sound: " + dog.sound())

    println("Dog Breathes: " + dog.breathe())


    /*
    ====================================
    3. Extension Function
    ====================================
    */

    val worker = WorkerPoints(700)

    println("Worker Level: " + worker.level())


    /*
    ====================================
    4. Extension Property
    ====================================
    */

    println("Worker Level Name: " + worker.levelName)
}


/*
====================================
INTERFACE
====================================

Interface = Contract

Defines what methods must exist.

Interface DOES NOT store state.

Used heavily in:

- Repository pattern
- Dependency Injection
- Testing
*/

interface GamificationRepository {

    /*
    Must be implemented.
    */

    fun insertEvent(eventType: String)

    /*
    Interface can have default methods.
    */

    fun logEvent(type: String) {

        println("Event Logged: " + type)
    }
}


/*
====================================
IMPLEMENTING INTERFACE
====================================

Use : to implement interface.
*/

class GamificationRepositoryImpl : GamificationRepository {

    override fun insertEvent(eventType: String) {

        println("Inserted Event: " + eventType)
    }
}


/*
====================================
INHERITANCE
====================================

Inheritance allows child class
to reuse parent class features.

By default Kotlin classes are FINAL.

Need open keyword to inherit.
*/

open class Animal(

    val name: String
) {

    /*
    open allows override.
    */

    open fun sound(): String {

        return "Unknown Sound"
    }

    /*
    Non-open function.
    */

    fun breathe(): String {

        return "Breathing"
    }
}


/*
====================================
CHILD CLASS
====================================

Uses : ParentClass()
*/

class Dog(name: String) : Animal(name) {

    /*
    override replaces parent method.
    */

    override fun sound(): String {

        return "Woof"
    }
}


/*
====================================
DATA CLASS
====================================

Used for extension examples.
*/

data class WorkerPoints(

    val totalXp: Int
)


/*
====================================
EXTENSION FUNCTION
====================================

Adds function to existing class.

No need to edit original class.
*/

fun WorkerPoints.level(): Int {

    return when {

        totalXp >= 1000 -> 5

        totalXp >= 500 -> 4

        totalXp >= 200 -> 3

        else -> 1
    }
}


/*
====================================
EXTENSION PROPERTY
====================================

Adds property to existing class.
*/

val WorkerPoints.levelName: String

    get() = when {

        totalXp >= 1000 -> "Health Master"

        totalXp >= 500 -> "Senior Worker"

        totalXp >= 200 -> "Intermediate Worker"

        else -> "Beginner Worker"
    }


/*
====================================
SUMMARY
====================================

interface → contract
implementation → fulfills interface
open → allows inheritance
override → replaces parent method
inheritance → reuse code
extension function → add function externally
extension property → add property externally

Used heavily in Android architecture.
*/
