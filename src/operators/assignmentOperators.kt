package operators

/*--------------------------------------------------
2️⃣ ASSIGNMENT OPERATORS
--------------------------------------------------*/

fun assignmentOperators() {

    var x = 10

    x += 5   // x = x + 5
    x -= 3   // x = x - 3
    x *= 2   // x = x * 2
    x /= 4   // x = x / 4
    x %= 3   // x = x % 3

    // NOTE:
    // Kotlin does NOT allow assignment inside expressions like Java
    // if (x = 5) ❌ (compile-time error)
}
