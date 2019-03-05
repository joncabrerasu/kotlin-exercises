package exercises.collections

fun main(args: Array<String>) {
    val listNumbers = listOf(1, 2, 3, 4, 5)

    println(listNumbers.find { it > 3 }) // 4
    println(listNumbers.findLast { it > 3 }) // 5
}