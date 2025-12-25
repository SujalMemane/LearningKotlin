/*

Kotlin is a STATICALY TYPED language with TYPE INFERENCE.
→ Type is checked at compile time
→ Compiler can infer type automatically

INTERVIEW TIP:
Kotlin is NOT dynamically typed like Python/JS.
*/

/*--------------------------------------------------
1️⃣ VARIABLES: val vs var
--------------------------------------------------*/

fun variablesBasics() {

    // val → IMMUTABLE (read-only)
    // WHY: Safer, prevents accidental changes
    // REAL-WORLD: Always prefer val unless mutation is required
    val age: Int = 20

    // age = 21 ❌ Compile-time error (cannot reassign val)

    // var → MUTABLE
    // USE CASE: Counters, changing states, loops
    var score: Int = 10
    score = 20 // ✅ allowed

    // TYPE INFERENCE
    // Compiler automatically infers type
    val name = "Sujal"   // String
    val marks = 85       // Int
    val pi = 3.14        // Double

    // INTERVIEW TIP:
    // Kotlin encourages IMMUTABILITY → val > var
}
