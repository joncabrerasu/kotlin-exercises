package exercises.collections

// Map Element Access
// When applied to a map, [] operator returns the value corresponding to the given key, or null if there is no such key in the map.
// getValue function returns an existing value corresponding to the given key or throws an exception if the key wasn't found.
// For maps created with withDefault, getValue returns the default value instead of throwing an exception.

fun main(args: Array<String>) {
    val cities : HashMap<String, String> = hashMapOf("France" to "Paris", "Italy" to "Rome", "Spain" to "Seville")
    val citiesWitHDefault = mapOf("France" to "Paris", "Italy" to "Rome", "Spain" to "Seville").withDefault { "Brasil" to "Rio de Janeiro" }

    println(cities["Spain"]) // Seville
    println(cities["Deutchland"]) // null

    println(cities.getValue("Spain")) // Seville
    println(citiesWitHDefault.getValue("Deutchland")) // Prints 'Brasil', 'Rio de Janeiro'

    println(cities.getValue("Deutchland")) // Prints exception
}