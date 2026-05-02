/*
====================================
FIREBASE — COMPLETE NOTES
====================================

Firebase = Backend Services Platform

Built by Google.

Provides:

- Authentication
- Database
- Notifications
- Analytics
- Crash Tracking
- Cloud Messaging
- Remote Config

Used heavily in Android apps.
*/


/*
====================================
FIREBASE PRODUCTS
====================================

Common Firebase services:

1. Firebase Authentication
2. Firestore Database
3. Realtime Database
4. Cloud Messaging
5. Firebase Analytics
6. Crashlytics
7. Remote Config
*/


/*
====================================
1. FIREBASE AUTHENTICATION
====================================

Used for:

- Login
- Signup
- User identity
- Access control
*/

class FirebaseAuthExample {

    fun loginUser() {

        println("User Logged In")
    }
}


/*
====================================
2. FIRESTORE DATABASE
====================================

Cloud database.

Stores structured data.

Examples:

- User profile
- XP records
- Leaderboards
- Worker statistics
*/


/*
====================================
Example Firestore Document
====================================

Collection:
workers

Document:
worker_001

Fields:
name
village
xp
*/


/*
====================================
3. REALTIME DATABASE
====================================

Realtime syncing database.

Updates instantly.

Used for:

- Live updates
- Chat
- Shared state
*/


/*
====================================
4. FIREBASE CLOUD MESSAGING
====================================

FCM = Push Notifications

Used for:

- Alerts
- Reminders
- Gamification rewards
- Badge unlocks
- Health notifications
*/


/*
====================================
Notification Example
====================================

"Congratulations!
You completed 5 visits today."
*/


/*
====================================
5. FIREBASE ANALYTICS
====================================

Tracks app events.

Examples:

- Button clicks
- Screen visits
- Feature usage
- Engagement tracking
*/


/*
====================================
Analytics Event Example
====================================
*/

fun logGamificationEvent() {

    println("Badge Earned Event")
}


/*
====================================
6. FIREBASE CRASHLYTICS
====================================

Tracks app crashes.

Benefits:

- Error monitoring
- Stack traces
- Device info
- Crash frequency
*/


/*
====================================
7. REMOTE CONFIG
====================================

Change app behavior remotely.

No app update required.

Examples:

- XP multiplier
- Feature toggle
- Reward changes
*/


/*
====================================
8. FIREBASE + FLW
====================================

FLW already uses Firebase.

Possible usage:

- Sync notifications
- Worker reminders
- Analytics tracking
- Engagement metrics
*/


/*
====================================
9. FIREBASE BENEFITS
====================================

- Easy backend
- Google ecosystem
- Analytics
- Notifications
- Fast integration
- Works with Android
*/


/*
====================================
10. Firebase Architecture
====================================

App
↓
Firebase SDK
↓
Firebase Service
↓
Cloud
*/


/*
====================================
11. Firebase Use Cases
====================================

Authentication → login
Firestore → cloud storage
FCM → notifications
Analytics → tracking
Crashlytics → crash logs
Remote Config → remote updates
*/


/*
====================================
12. Important Rules
====================================

Firebase helps when:

- Backend not available
- Analytics needed
- Push notifications required
- Cloud sync needed
*/


/*
====================================
SUMMARY
====================================

Firebase → backend platform
FCM → notifications
Analytics → event tracking
Firestore → cloud database
Crashlytics → crash reports
Remote Config → dynamic settings

Firebase is widely used in Android.
*/
