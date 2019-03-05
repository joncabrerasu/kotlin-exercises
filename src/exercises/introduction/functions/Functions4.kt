package exercises.introduction.functions

// Functions with vararg Parameters
// Varargs allow you to pass any number of arguments by separating them with commas

fun printMessages(vararg messages: String, prefix: String = "DEBUG") {
    messages.forEach { println("[$prefix] $it") }
}

fun printAllMessages(vararg messages: String, prefix: String) {
    printMessages(*messages, prefix = prefix)
}

fun main(args: Array<String>) {
    printMessages("This", "Is", "A", "vararg", "Test")
    printAllMessages("This", "Is", "A", "second", "vararg", "Test", prefix = "INFO")
}