/*
====================================
ANDROID PROJECT STRUCTURE
COMPLETE NOTES
====================================

Android apps are divided into folders.

Purpose:

- Organize code
- Separate responsibilities
- Improve readability
- Improve scalability

Large apps use layered structure.

Example:

FLW-Mobile-App
Habit Tracker App
Healthcare Apps
*/


/*
====================================
COMMON ANDROID PROJECT STRUCTURE
====================================

app/
│
├── data/
├── domain/
├── presentation/
├── di/
├── utils/
├── ui/
├── repository/
├── database/
├── network/
*/


/*
====================================
1. app/
====================================

Main Android module.

Contains:

- Entire application
- Manifest
- Gradle
- Resources
*/


/*
====================================
2. presentation/
====================================

UI layer.

Contains:

- Activity
- Fragment
- ViewModel
- UI State
- Screen logic

Examples:

presentation/
    worker/
    dashboard/
    gamification/
*/


/*
====================================
3. data/
====================================

Handles data sources.

Contains:

- Repository
- Local DB
- Remote API
- DTO models
*/


/*
====================================
4. domain/
====================================

Business logic layer.

Contains:

- Use cases
- Domain models
- Rules
*/


/*
====================================
5. repository/
====================================

Repository manages data.

Acts as bridge between:

UI
↓
Database/API
*/


/*
====================================
6. database/
====================================

Local storage.

Contains:

- Room Database
- DAO
- Entity
*/


/*
====================================
7. network/
====================================

API communication.

Contains:

- Retrofit
- API Service
- Response models
*/


/*
====================================
8. di/
====================================

Dependency Injection folder.

Contains:

- Hilt modules
- Providers
- Injectors
*/


/*
====================================
9. utils/
====================================

Utility helpers.

Contains:

- Constants
- Extensions
- Formatter
- Validators
*/


/*
====================================
10. res/
====================================

Resources folder.

Contains:

- layout/
- drawable/
- values/
- strings/
- colors/
*/


/*
====================================
11. AndroidManifest.xml
====================================

App configuration file.

Contains:

- Activities
- Permissions
- Application setup
*/


/*
====================================
12. Gradle Files
====================================

Dependency management.

Controls:

- Libraries
- SDK version
- Build configuration
*/


/*
====================================
REAL PROJECT FLOW
====================================

User Click
↓
Activity / Fragment
↓
ViewModel
↓
UseCase
↓
Repository
↓
Database/API
↓
Result Returned
*/


/*
====================================
EXAMPLE FLW STRUCTURE
====================================

app/
│
├── data/
│     ├── repository/
│     ├── local/
│     └── remote/
│
├── domain/
│     ├── usecase/
│     └── model/
│
├── presentation/
│     ├── dashboard/
│     ├── worker/
│     └── gamification/
│
├── di/
│
├── database/
│
├── utils/
*/


/*
====================================
GAMIFICATION MODULE LOCATION
====================================

Good placement:

presentation/gamification/
domain/usecase/gamification/
data/repository/gamification/
database/gamification/
*/


/*
====================================
WHY STRUCTURE IMPORTANT
====================================

Benefits:

- Easy navigation
- Team collaboration
- Easier debugging
- Easier scaling
- Cleaner architecture
*/


/*
====================================
COMMON BEGINNER MISTAKE
====================================

Bad:

Everything inside one folder.

Good:

Separate by responsibility.
*/


/*
====================================
IMPORTANT RULES
====================================

1. Keep UI inside presentation
2. Keep logic inside domain
3. Keep data inside repository
4. Separate concerns
5. Avoid large files
*/


/*
====================================
SUMMARY
====================================

app → main module
presentation → UI
domain → business logic
data → storage/API
repository → data manager
database → Room DB
network → API
di → dependency injection
utils → helper code

Project structure = easier development.
*/
