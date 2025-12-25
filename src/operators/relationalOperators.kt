package operators

/*--------------------------------------------------
3️⃣ RELATIONAL (COMPARISON) OPERATORS
--------------------------------------------------*/

fun relationalOperators() {

    val a = 10
    val b = 20

    println(a > b)   // false
    println(a < b)   // true
    println(a >= b)  // false
    println(a <= b)  // true
    println(a == b)  // false
    println(a != b)  // true

    // IMPORTANT:
    // == → Structural equality (calls equals())
    // === → Referential equality (same memory reference)

    val s1 = "Kotlin"
    val s2 = "Kotlin"

    println(s1 == s2)   // true (content same)
    println(s1 === s2)  // may be true or false

    // INTERVIEW TIP:
    // == in Kotlin ≠ == in Java
}
