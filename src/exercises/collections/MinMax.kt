package exercises.collections

// min and max functions return the smallest and the largest element of a collection. If the collection is empty,
// they return null.

fun main(args: Array<String>) {
    val numbers = listOf(1, 2 , 3, 4, 5, 6 , 8, 9, 10)
    val emptyList = emptyList<Int>()

    println("Min ${numbers.min()} Max ${numbers.max()}")
    println("Min ${emptyList.min()} Max ${emptyList.max()}")
}