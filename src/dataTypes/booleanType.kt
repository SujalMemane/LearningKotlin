package dataTypes


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
