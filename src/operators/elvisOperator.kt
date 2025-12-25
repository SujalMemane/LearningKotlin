package operators

/*--------------------------------------------------
🔟 ELVIS OPERATOR (?:)
--------------------------------------------------*/

fun elvisOperator() {

    val name: String? = null

    // If left is null → use right
    val length = name?.length ?: 0

    // REAL-WORLD:
    // Default values, null handling
}
