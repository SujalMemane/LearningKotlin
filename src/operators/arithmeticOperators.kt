package operators

/*
====================================================
KOTLIN OPERATORS
====================================================

Operators are symbols used to perform operations on variables and values.

Kotlin operators are:
- Safer than Java
- Null-aware
- Highly readable (operator overloading support)

INTERVIEW TIP:
Kotlin reduces boilerplate by replacing many operators with readable functions.
*/

/*--------------------------------------------------
1️⃣ ARITHMETIC OPERATORS
--------------------------------------------------*/

fun arithmeticOperators() {

    val a = 10
    val b = 3

    // BASIC ARITHMETIC
    println(a + b)  // Addition → 13
    println(a - b)  // Subtraction → 7
    println(a * b)  // Multiplication → 30
    println(a / b)  // Division → 3 (Int division)
    println(a % b)  // Modulus → 1 (remainder)

    // EDGE CASE:
    // Integer division truncates decimals
    val correct = a.toDouble() / b
    println(correct) // 3.333...

    // INTERVIEW TIP:
    // / behaves differently for Int vs Double
}