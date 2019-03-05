package exercises.collections

fun main(args: Array<String>) {
    val listNumbers = listOf(1, 2, 3, 4, 5)

    // Any -> returns true if any exists
    println(listNumbers.any{ it < 5 }) // true
    println(listNumbers.any{ x -> x > 5 }) // false

    // All -> returns true if all match condition
    println(listNumbers.all {  x -> x > 0 }) // true
    println(listNumbers.all { it < 3 }) // false

    // None -> returns true if none of all match condition
    println(listNumbers.none{ it < 0}) // true
    println(listNumbers.none{ x -> x > 1 }) // false

}