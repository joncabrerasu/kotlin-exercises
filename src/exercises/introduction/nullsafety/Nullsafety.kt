package exercises.introduction.nullsafety

// Null Safety
// In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
// If you need a variable that can be null, declare it nullable by adding ? at the end of its type.

fun main(args: Array<String>) {
    var nonNull: String = "message"

    // Can't assign to null
    // nonNull = null

    var maybeNull: String? = "kind message"
    maybeNull = null

    var inferredVar = "Message"
    // When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    // inferredVar = null

    fun printMessage(message: String) {
        println(message)
    }

    printMessage(nonNull) // OK

    // call same function with nullable type not ok (compile error)
    //printMessage(maybeNull)

}
