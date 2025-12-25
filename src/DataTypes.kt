
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

/*--------------------------------------------------
BOOLEAN TYPE
--------------------------------------------------*/

fun booleanType() {

    val isLoggedIn: Boolean = true
    val hasPermission = false // inferred

    // Used heavily in:
    // - Conditions
    // - Flags
    // - State handling

    // COMMON MISTAKE:
    // if (isLoggedIn == true) ❌
    // if (isLoggedIn) ✅
}

/*--------------------------------------------------
CHARACTER TYPE
--------------------------------------------------*/

fun charType() {

    val letter: Char = 'A'
    val digit: Char = '7'
    val symbol: Char = '@'

    // NOTE:
    // Char uses SINGLE quotes
    // String uses DOUBLE quotes

    // EDGE CASE:
    // val ch: Char = 'AB' ❌ (only ONE character)
}

/*--------------------------------------------------
STRING TYPE
--------------------------------------------------*/

fun stringType() {

    val name = "Kotlin"

    // STRING TEMPLATES
    // WHY: Cleaner and safer than concatenation
    println("Language: $name")
    println("Length: ${name.length}")

    // MULTI-LINE STRING
    val message = """
        Hello,
        Welcome to Kotlin
        This is a raw string
    """.trimIndent()

    println(message)

    // ESCAPE CHARACTERS
    println("Line1\nLine2")
    println("Tab\tSpace")
    println("Quote: \"Hello\"")

    // INTERVIEW TIP:
    // Strings are IMMUTABLE in Kotlin
}

/*--------------------------------------------------
 WHEN TO USE WHAT (SUMMARY)
--------------------------------------------------

val        → Default choice
var        → Only when mutation needed
Int        → Default integer
Double     → Default decimal
String     → Text
Boolean    → Conditions
Char       → Single character
String?    → Nullable text

INTERVIEW GOLD:
"Prefer immutability, explicit conversion, and null safety"


*/
