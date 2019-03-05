package exercises.collections

// Set
// A set is an unordered collection that does not support duplicates. For creating sets, there are functions setOf()
// and mutableSetOf(). A read-only view of a mutable set can be obtained by casting it to Set.

val mutableSetOfPersons : MutableSet<String> = mutableSetOf("John", "Robert", "Jessica", "Christina")

fun addPersonToMutableSet(person: String) : Boolean = mutableSetOfPersons.add(person)

fun isAdded(flag: Boolean) = if(flag) "Is Added" else "Not Added"

fun main(args: Array<String>) {
    println("Initial set: $mutableSetOfPersons")
    println("Adding a new name 'Gareth' with result ${isAdded(addPersonToMutableSet("Gareth"))}")
    println("Actual set $mutableSetOfPersons")
    println("Adding a new name 'John' with result ${isAdded(addPersonToMutableSet("John"))}")
    println("Actual set $mutableSetOfPersons")
}