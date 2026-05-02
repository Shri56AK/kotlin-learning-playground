/*
====================================
KOTLIN FLOW & STATEFLOW
COMPLETE NOTES
====================================

Flow is used for asynchronous streams.

Meaning:

Flow emits multiple values over time.

Used heavily in:

- Room Database
- ViewModel
- Repository Pattern
- API streams
- Real-time UI updates
- FLW offline sync updates

Analogy:

Normal Function → returns ONE value
Flow → returns MANY values over time
*/


/*
====================================
Required Imports
====================================
*/

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking {

    /*
    ====================================
    1. Basic Flow
    ====================================
    */

    simpleFlow().collect {

        println("Collected Value: " + it)
    }


    /*
    ====================================
    2. Flow Operators
    ====================================
    */

    simpleFlow()

        .map {

            it * 2
        }

        .filter {

            it > 4
        }

        .collect {

            println("Processed Value: " + it)
        }


    /*
    ====================================
    3. flowOf
    ====================================
    */

    flowOf(

        "Priya",
        "Asha",
        "Meera"

    ).collect {

        println("Worker Name: " + it)
    }


    /*
    ====================================
    4. MutableStateFlow
    ====================================

    Holds current state.
    */

    val scoreState = MutableStateFlow(0)

    println("Initial State: " + scoreState.value)

    scoreState.value = 50

    println("Updated State: " + scoreState.value)


    /*
    ====================================
    5. StateFlow Collection
    ====================================
    */

    val xpFlow = MutableStateFlow(100)

    launch {

        xpFlow.collect {

            println("XP Updated: " + it)
        }
    }

    xpFlow.value = 200

    xpFlow.value = 300

    delay(1000)


    /*
    ====================================
    6. SharedFlow
    ====================================

    Sends events to multiple collectors.
    */

    val sharedFlow = MutableSharedFlow<String>()

    launch {

        sharedFlow.collect {

            println("Collector 1: " + it)
        }
    }

    launch {

        sharedFlow.collect {

            println("Collector 2: " + it)
        }
    }

    sharedFlow.emit("New Badge Unlocked")

    delay(1000)


    /*
    ====================================
    7. Flow Builder
    ====================================
    */

    flow {

        emit(10)

        emit(20)

        emit(30)

    }.collect {

        println("Flow Builder Value: " + it)
    }


    /*
    ====================================
    8. first()
    ====================================
    */

    val firstValue = simpleFlow().first()

    println("First Value: " + firstValue)


    /*
    ====================================
    9. toList()
    ====================================
    */

    val flowList = simpleFlow().toList()

    println("Flow To List: " + flowList)


    /*
    ====================================
    10. reduce()
    ====================================
    */

    val total = simpleFlow().reduce {

        accumulator, value ->

        accumulator + value
    }

    println("Reduced Total: " + total)
}


/*
====================================
Simple Flow Function
====================================
*/

fun simpleFlow(): Flow<Int> = flow {

    emit(1)

    delay(500)

    emit(2)

    delay(500)

    emit(3)
}


/*
====================================
FLOW OPERATORS
====================================

map → transform values
filter → keep matching values
reduce → combine values
first → first value
toList → convert flow to list
*/


/*
====================================
STATEFLOW
====================================

StateFlow always has latest value.

Used for UI state.
*/


/*
====================================
SHAREDFLOW
====================================

SharedFlow used for events.

Examples:

- Toast messages
- Navigation events
- Badge unlocked events
*/


/*
====================================
FLOW VS STATEFLOW
====================================

Flow → stream of values
StateFlow → observable state holder
SharedFlow → event broadcaster
*/


/*
====================================
IMPORTANT RULES
====================================

1. Flow is cold stream
2. StateFlow always active
3. collect receives values
4. emit sends values
5. StateFlow keeps latest state
*/


/*
====================================
SUMMARY
====================================

Flow → async stream
collect → receive values
emit → send value
map → transform flow
filter → filter flow
StateFlow → state holder
SharedFlow → event stream
first → first item
reduce → combine values

Flow is essential for Android MVVM.
*/
