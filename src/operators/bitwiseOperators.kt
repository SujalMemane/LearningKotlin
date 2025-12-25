package operators

/*--------------------------------------------------
6️⃣ BITWISE OPERATORS (FUNCTION BASED)
--------------------------------------------------*/

fun bitwiseOperators() {

    val a = 5   // 0101
    val b = 3   // 0011

    // Kotlin DOES NOT use symbols like &, |, ^
    // Uses named functions instead

    println(a and b)  // AND → 1
    println(a or b)   // OR → 7
    println(a xor b)  // XOR → 6
    println(a shl 1)  // Shift left → 10
    println(a shr 1)  // Shift right → 2
    println(a ushr 1) // Unsigned shift

    // INTERVIEW TIP:
    // Bitwise ops are functions, not operators
}