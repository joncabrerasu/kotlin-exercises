package exercises.collections

// List
// A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List).
// For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable
// lists. To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.

val systemUsers : MutableList<String> = mutableListOf("Alex", "Michael", "Jessica")
val sudoUsers : List<String> = systemUsers

fun addSystemUser(systemUser: String) = systemUsers.add(systemUser)

fun getSysSudoUsers() : List<String> = sudoUsers

fun main(args: Array<String>) {
    println("System Users: $systemUsers")
    println("Sudo Users: ${getSysSudoUsers()}")

    addSystemUser("Robert")

    println("System Users: $systemUsers")
    println("Sudo Users: ${getSysSudoUsers()}")

    // getSysSudoUsers().add("Toni")

}