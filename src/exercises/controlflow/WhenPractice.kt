package exercises.controlflow

fun checkElement(element: Any) {
    when (element) {
        1 -> println("Is a number one")
        "Hello" -> println("You say hello")
        is Number -> println("Is any number")
        is Boolean -> println("Is a Boolean value")
        else -> println("Invalid value")
    }
}

fun checkElementAsAnyValue(element: Any) : Any {
    val ret = when (element) {
        "Hello" -> "You say Hello!"
        else -> "Sorry, i don't understand you"
    }
    return ret
}

fun main(args: Array<String>) {
    checkElement(1)
    checkElement("Hello")
    checkElement(2)
    checkElement(true)

    val ret = checkElementAsAnyValue("Hello")
    val ret2 = checkElementAsAnyValue(1)
    println(ret)
    println(ret2)
}