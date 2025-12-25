package operators

/*--------------------------------------------------
1️⃣1️⃣ SAFE CALL & NOT NULL ASSERTION
--------------------------------------------------*/

fun nullOperators() {

    val name: String? = "Kotlin"

    // SAFE CALL
    println(name?.length)

    // NOT NULL ASSERTION (DANGEROUS)
    // println(name!!.length)

    // INTERVIEW WARNING:
    // !! defeats Kotlin's null safety
}
