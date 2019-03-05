package exercises.introduction.nullsafety

// Working with Nulls
// Sometimes Kotlin programs need to work with null values, such as when interacting with external Java code or
// representing a truly absent state. Kotlin provides null tracking to elegantly deal with such situations.

fun printMessage(message: String?) {
    if(message != null && !message.isEmpty()) {
        println(message)
    } else {
        println("cannot print a null message")
    }
}

fun main(args: Array<String>) {
    var nullableMessage : String? = "cool message"
    printMessage(nullableMessage)
    nullableMessage = null
    printMessage(nullableMessage)
}