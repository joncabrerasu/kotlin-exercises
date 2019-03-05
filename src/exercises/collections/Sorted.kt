package exercises.collections

fun main(args: Array<String>) {
    val numbers = listOf(3, 1, 2)
    println(numbers.sorted())
    println(numbers.sortedByDescending { it })
}