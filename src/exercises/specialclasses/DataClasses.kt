package exercises.specialclasses

// Data Classes
// Data classes make it easy to create classes that are used to store values. Such classes are automatically provided with methods for copying, getting a string representation, and using instances in collections.

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {

    val user = User("Alex", 1)

    println(user)

    val user2 = User("Alex", 1)
    val user3 = User("Max", 2)
    println("user == user2? ${user == user2}")
    println("user == user3? ${user == user3}")

    println(user.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())

    println(user.copy())
    println(user.copy(name="Jon"))
    println(user.copy(id=3))

    println("User name = ${user.component1()}")
    println("User id = ${user.component2()} ")

}