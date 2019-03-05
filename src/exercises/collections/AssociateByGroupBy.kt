package exercises.collections

// associateBy, groupBy
// Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
// The key is defined in the keySelector parameter. You can also specify an optional valueSelector to define what
// will be stored in the value of the map element.
// The difference between associateBy and groupBy is how they process objects with the same key: associateBy uses
// the last suitable element as the value. groupBy builds a list of all suitable elements and puts it in the value.
// The returned map preserves the entry iteration order of the original collection.

data class Friend(val name: String, val city: String, val phone: String)

fun main(args: Array<String>) {
    val friends = listOf(
            Friend("Robert", "Madrid", "616123456"),
            Friend("Jessica", "Berlin","616123457"),
            Friend("Christine", "Munich", "616123458"),
            Friend("Alex", "Monaco","616123459"),
            Friend("Marc", "Barcelona","616123459"))

    println(friends.associateBy { it.phone })
    println(friends.groupBy { it.phone })

    println(friends.associateBy ( Friend::phone, Friend::city ))
    println(friends.groupBy ( Friend::phone, Friend::city  ))

}