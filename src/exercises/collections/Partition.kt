package exercises.collections

// partition
// partition function splits the original collection into pair of lists using a given predicate: Elements for which the predicate is true. Elements for which the predicate is false.

fun main(args: Array<String>) {
    val cities = listOf(Pair("Spain", "Madrid") , Pair("Italy", "Rome"), Pair("France", "Paris"), Pair("Spain", "Seville"))
    val partitionCities = cities.partition { x -> x.first == "Spain" }
    val (spanishCities, outsideCities) = partitionCities

    println("Cities from spain ${partitionCities.first}")
    println("Cities outside spain ${partitionCities.second}")

    println("Cities from spain $spanishCities")
    println("Cities outside spain $outsideCities")
}