/*--------------------------------------------------
 TYPE CONVERSION (IMPORTANT)
--------------------------------------------------*/

fun typeConversion() {

    val x: Int = 10

    // EXPLICIT CONVERSION REQUIRED
    val y: Double = x.toDouble()

    // COMMON CONVERSIONS:
    // toInt(), toLong(), toFloat(), toDouble(), toString()

    // WHY?
    // Prevents unexpected data loss

    // INTERVIEW QUESTION:
    // Does Kotlin support implicit casting? → ❌ NO
}
