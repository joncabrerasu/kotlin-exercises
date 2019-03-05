package exercises.scopefunctions

// let
// The Kotlin standard library function let can be used for scoping and null-checks. When called on an object,
// let executes the given block of code and returns the result of its last expression. The object is accessible inside
// the block by the reference it.

fun printMessage(message: String?) {
    message?.let {
        println(it)
    }
}

fun main(args: Array<String>) {

    printMessage("Test with let scope function")

    val empty = "Test".let { it.isEmpty() }
    println("Is empty $empty")

}