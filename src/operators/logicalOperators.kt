package operators

/*--------------------------------------------------
4️⃣ LOGICAL OPERATORS
--------------------------------------------------*/

fun logicalOperators() {

    val isLoggedIn = true
    val hasPermission = false

    // AND (&&)
    println(isLoggedIn && hasPermission)

    // OR (||)
    println(isLoggedIn || hasPermission)

    // NOT (!)
    println(!isLoggedIn)

    // SHORT-CIRCUIT BEHAVIOR:
    // Second condition runs only if needed
    // IMPORTANT for performance & null safety
}
