package exercises.collections

// zip
// zip function merges two given collections into a new collection. By default, the result collection contains
// Pairs of source collection elements with the same index. However, you can define own structure of the result collection element.
// The size of the result collection equals to the minumum size of a source collection.

fun main(args: Array<String>) {
    val countries = listOf("Spain", "France", "Italy", "Deutchland")
    val cities = listOf("Madrid", "Paris", "Rome")
    println(countries zip cities)
}