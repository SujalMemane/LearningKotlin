package operators

/*--------------------------------------------------
8️⃣ IN & NOT IN OPERATORS
--------------------------------------------------*/

fun inOperator() {

    val x = 5

    // in → checks presence
    println(x in 1..10)   // true
    println(x !in 1..4)  // true

    val list = listOf(1, 2, 3)
    println(2 in list)   // true

    // REAL-WORLD:
    // Validation checks
}