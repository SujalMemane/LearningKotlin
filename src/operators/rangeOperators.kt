package operators


/*--------------------------------------------------
7️⃣ RANGE OPERATORS
--------------------------------------------------*/

fun rangeOperators() {

    // Inclusive range
    for (i in 1..5) {
        print("$i ")
    }

    // Until (excludes end)
    for (i in 1 until 5) {
        print("$i ")
    }

    // DownTo
    for (i in 5 downTo 1) {
        print("$i ")
    }

    // Step
    for (i in 1..10 step 2) {
        print("$i ")
    }

    // USE CASE:
    // Loops, iterations, validations
}