package dataTypes

/*--------------------------------------------------
 NUMBER DATA TYPES
--------------------------------------------------*/

fun numberTypes() {

    // INTEGER TYPES
    val byte: Byte = 127        // 8-bit
    val short: Short = 32000    // 16-bit
    val int: Int = 100000       // 32-bit (MOST USED)
    val long: Long = 1000000000L // 64-bit (suffix L is mandatory)

    // FLOATING POINT
    val floatNum: Float = 3.14F // suffix F required
    val doubleNum: Double = 3.141592653 // default for decimals

    // WHY Double > Float?
    // - More precision
    // - Preferred in calculations

    // EDGE CASE:
    // val x = 10 / 3 → result is Int (3)
    val result = 10 / 3
    val correct = 10.0 / 3 // Double division

    // INTERVIEW TIP:
    // Kotlin does NOT auto-convert Int to Double
}