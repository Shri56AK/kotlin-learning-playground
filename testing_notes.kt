/*
====================================
ANDROID TESTING — COMPLETE NOTES
====================================

Testing verifies app behavior.

Goal:

Ensure code works correctly.

Testing helps:

- Catch bugs
- Improve stability
- Validate business logic
- Prevent regressions
- Improve confidence
*/


/*
====================================
TYPES OF TESTING
====================================

1. Unit Testing
2. Integration Testing
3. UI Testing
4. End-to-End Testing
*/


/*
====================================
1. UNIT TESTING
====================================

Tests small logic pieces.

Examples:

- XP calculation
- Badge unlock logic
- Validation
- Utility functions
*/


/*
====================================
Unit Test Example
====================================
*/

fun calculateXp(visits: Int): Int {

    return visits * 10
}


/*
Expected:

calculateXp(5)

Result:

50
*/


/*
====================================
2. INTEGRATION TESTING
====================================

Tests multiple layers together.

Example:

Repository + Room Database
*/


/*
====================================
3. UI TESTING
====================================

Tests user interaction.

Examples:

- Button click
- Screen rendering
- Navigation
*/


/*
====================================
4. END-TO-END TESTING
====================================

Tests complete flow.

Example:

Login
↓
Open dashboard
↓
Add worker
↓
Save database
*/


/*
====================================
TESTING LIBRARIES
====================================

Common Android tools:

- JUnit
- Espresso
- Mockito
- Robolectric
*/


/*
====================================
JUnit Example
====================================
*/

class XpCalculator {

    fun getXp(taskCount: Int): Int {

        return taskCount * 20
    }
}


/*
====================================
Simple Test Case
====================================
*/

fun testXpCalculation() {

    val calculator = XpCalculator()

    val result = calculator.getXp(5)

    println("Expected: 100")

    println("Actual: " + result)
}


/*
====================================
Mockito
====================================

Used for fake objects.

Useful when:

- Database unavailable
- API unavailable
- Repository mocked
*/


/*
====================================
Espresso
====================================

Used for UI testing.

Checks:

- Button click
- Input text
- RecyclerView
*/


/*
====================================
Robolectric
====================================

Runs Android tests without device.
*/


/*
====================================
WHY TESTING MATTERS
====================================

Testing prevents:

- Crashes
- Logic errors
- Bad releases
- Sync failures
*/


/*
====================================
FLW CONNECTION
====================================

FLW requires testing because:

- Offline sync critical
- Worker data important
- Gamification scoring sensitive
- Health records must remain safe
*/


/*
====================================
TESTING BEST PRACTICES
====================================

1. Test business logic
2. Test edge cases
3. Keep tests small
4. Test repository layer
5. Avoid duplicate tests
*/


/*
====================================
EXAMPLE TEST CASES
====================================

Gamification Module:

- XP earned correctly?
- Badge unlock works?
- Streak updates?
- Offline sync works?
*/


/*
====================================
SUMMARY
====================================

Unit Test → logic testing
Integration Test → layers together
UI Test → interface testing
E2E Test → full workflow
JUnit → unit testing
Mockito → fake dependencies
Espresso → UI testing
Robolectric → Android testing

Testing improves reliability.
*/
