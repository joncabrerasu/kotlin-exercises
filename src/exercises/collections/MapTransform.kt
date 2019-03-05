package exercises.collections

fun main(args: Array<String>) {
    val listNumbers = listOf(1, 2, 3, 4, 5)
    println(listNumbers.map { x -> x * x })
    println(listNumbers.map { it * 2 })
}