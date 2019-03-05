package exercises.collections

// getOrElse
// getOrElse provides safe access to elements of a collection. It takes an index and a function that provides
// the default value in cases when the index is out of bound.

fun main(args: Array<String>) {
    val listNumbers = listOf(1, 2, 3, 4, 5, 6)
    println(listNumbers.getOrElse(21) {1})

    val map = mutableMapOf<String, String?>()

    println(map.getOrElse("Hi") { "Bye" }) // Bye
    map["Hi"] = "Hi my friend"
    println(map.getOrElse("Hi") { "Bye"}) // Hi my friend
    map["Hi"] = null
    println(map.getOrElse("Hi") { "Bye"}) // Bye

}