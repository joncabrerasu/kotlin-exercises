package exercises.collections


// flatMap transforms each element of a collection into an iterable object and builds a single list of the
// transformation results. The transformation is user-defined.

fun main(vararg args : String) {
    val numbers = listOf(1, 2, 3)
    // Important thing is that it's not a list of lists; it's a list of integers with nine elements.
    println(numbers.flatMap { listOf(it, it, it) })
}