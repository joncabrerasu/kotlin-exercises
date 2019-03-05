package exercises.introduction.functions

// Default Parameter Values and Named Arguments

fun printMessage(message: String) : Unit  {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "INFO") : Unit {
    println("[$prefix] - $message" )
}

fun sum(x: Int, y: Int) : Int  { return x + y }

fun mul(x: Int, y: Int) = x * y

fun main(args: Array<String>) {
    printMessage("Printing Message inside a function")
    printMessageWithPrefix("Printing Message inside a function with default prefix")
    printMessageWithPrefix("Printing Message inside a function with passed prefix", "DEBUG")
    println(sum(4, 9))
    println(mul(4, 9))
}