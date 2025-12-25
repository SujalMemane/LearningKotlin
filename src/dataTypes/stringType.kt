package dataTypes

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
