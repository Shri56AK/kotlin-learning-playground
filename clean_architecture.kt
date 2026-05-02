/*
====================================
CLEAN ARCHITECTURE — COMPLETE NOTES
====================================

Clean Architecture separates app layers.

Goal:

- Reduce dependency
- Improve testing
- Improve maintainability
- Improve scalability
- Make modules reusable

Created by:

:contentReference[oaicite:1]{index=1}
*/


/*
====================================
LAYERS OF CLEAN ARCHITECTURE
====================================

Presentation Layer
↓
Domain Layer
↓
Data Layer
*/


/*
====================================
1. PRESENTATION LAYER
====================================

Handles UI.

Includes:

- Activity
- Fragment
- Compose
- ViewModel
*/


/*
====================================
Presentation Example
====================================
*/

class WorkerViewModel {

    fun loadWorkers() {

        println("Load Worker UI")
    }
}


/*
====================================
2. DOMAIN LAYER
====================================

Contains business rules.

Most important layer.

Includes:

- Use Cases
- Business Logic
- Entities
*/


/*
====================================
Domain Entity Example
====================================
*/

data class Worker(

    val id: Int,

    val name: String,

    val xp: Int
)


/*
====================================
Use Case Example
====================================
*/

class CalculateXpUseCase {

    fun calculate(visits: Int): Int {

        return visits * 20
    }
}


/*
====================================
3. DATA LAYER
====================================

Handles data sources.

Includes:

- Repository
- Room
- Retrofit
- Firebase
*/


/*
====================================
Repository Example
====================================
*/

class WorkerRepository {

    fun fetchWorkers(): List<Worker> {

        return listOf()
    }
}


/*
====================================
FLOW OF CLEAN ARCHITECTURE
====================================

UI
↓
ViewModel
↓
UseCase
↓
Repository
↓
Database/API
*/


/*
====================================
WHY CLEAN ARCHITECTURE?
====================================

Benefits:

- Independent layers
- Easier testing
- Replace database easily
- Replace API easily
- Better scalability
*/


/*
====================================
DEPENDENCY RULE
====================================

Outer layers depend inward.

Data Layer → Domain
Presentation → Domain

Domain should NOT depend outward.
*/


/*
====================================
EXAMPLE STRUCTURE
====================================

presentation/
    viewmodel/

domain/
    model/
    usecase/

data/
    repository/
    local/
    remote/
*/


/*
====================================
USE CASES
====================================

UseCase = Single action.

Examples:

- Calculate XP
- Add Worker
- Sync Offline Data
- Unlock Badge
*/


/*
====================================
FLW CONNECTION
====================================

Gamification module can follow:

Presentation
↓
Gamification ViewModel
↓
AwardXpUseCase
↓
Repository
↓
Room Database
*/


/*
====================================
WHY IMPORTANT FOR FLW
====================================

Gamification module should:

- Stay modular
- Avoid tight coupling
- Work independently
- Support testing
*/


/*
====================================
COMMON MISTAKES
====================================

Bad:

Activity directly calls database.

Good:

Activity → ViewModel → UseCase → Repository
*/


/*
====================================
IMPORTANT RULES
====================================

1. Keep business logic in domain
2. Keep UI simple
3. Keep repository data-focused
4. Separate concerns
*/


/*
====================================
SUMMARY
====================================

Presentation → UI
Domain → business logic
Data → storage/API
UseCase → single action
Repository → data source

Clean Architecture = scalable apps.
*/
