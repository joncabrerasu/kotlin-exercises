package exercises.controlflow

// Conditional Expression
// There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:

fun main(args: Array<String>) {
    fun max(a: Int, b: Int) = if(a > b) a else b
    println(max(3,7))
}