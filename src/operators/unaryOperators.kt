package operators

/*--------------------------------------------------
5️⃣ UNARY OPERATORS
--------------------------------------------------*/

fun unaryOperators() {

    var x = 10

    println(+x)  // Unary plus → no effect
    println(-x)  // Unary minus → -10

    println(++x) // Pre-increment → increments then uses
    println(x++) // Post-increment → uses then increments

    println(--x) // Pre-decrement
    println(x--) // Post-decrement

    // COMMON MISTAKE:
    // Avoid ++ and -- in complex expressions
}