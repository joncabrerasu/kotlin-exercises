package exercises.scopefunctions


// with is a non-extension function that can access members of its argument concisely: you can
// omit the instance name when referring to its members.


class Configuration(var host: String, var port: String)

fun main() {
    val configuration = Configuration("localhost", "8080")

    with(configuration) {
        println("$host : $port")
    }
}

