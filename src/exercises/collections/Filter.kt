package exercises.collections

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3 , 4, 5)
    println(numberList.filter { it > 3 })
    println(numberList.filter { x -> x < 5 })
}