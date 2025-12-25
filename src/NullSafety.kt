fun nullSafetyBasics() {

    // Non-null type
    val name: String = "Sujal"

    // Nullable type
    val nickname: String? = null

    // SAFE CALL
    // Executes only if value is not null
    println(nickname?.length)

    // ELVIS OPERATOR
    // Provides default value if null
    val length = nickname?.length ?: 0

    println(length)

    // NOT NULL ASSERTION (!!)
    // DANGEROUS → Can throw NullPointerException
    // println(nickname!!.length)

    // INTERVIEW TIP:
    // Kotlin's biggest advantage over Java → Null Safety
}
