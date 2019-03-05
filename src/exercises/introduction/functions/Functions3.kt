package exercises.introduction.functions

// Operator Functions
// Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.

operator fun Int.times(message: String) = message.repeat(this)

operator fun String.get(range: IntRange) = substring(range)

fun main(args: Array<String>) {
    println(2 * "Ciao ")

    val phrase = "loren ipsum alea jacta est"
    println(phrase[0..5])
}