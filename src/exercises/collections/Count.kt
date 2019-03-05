package exercises.collections

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5)

    println(numbers.count()) // 5
    println(numbers.count{ it % 2 == 0}) // 2
}