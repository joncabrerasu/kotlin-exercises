package exercises.collections

fun main(args: Array<String>) {
    val listNumbers = listOf(1, 2, 3, 4, 5)

    println(listNumbers.first()) // 1
    println(listNumbers.last()) // 5

    println(listNumbers.first { it % 2 == 0 }) // 2
    println(listNumbers.last { it % 2 == 0 }) // 4

    println(listNumbers.firstOrNull())
    println(listNumbers.lastOrNull())

    println(listNumbers.firstOrNull{ it == 5}) // 5
    println(listNumbers.lastOrNull{ it == 6}) // null


}