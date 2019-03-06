package exercises.delegation

class Users(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val user = Users(mapOf("name" to "Robert", "age" to 25))
    println("${user.name} - ${user.age}")
}