package operators

/*--------------------------------------------------
9️⃣ TYPE CHECKING OPERATORS
--------------------------------------------------*/

fun typeCheckingOperators(obj: Any) {

    // is → type check
    if (obj is String) {
        println(obj.length) // Smart casting
    }

    // !is → not of type
    if (obj !is Int) {
        println("Not an Int")
    }

    // INTERVIEW TIP:
    // Kotlin supports SMART CASTING automatically
}