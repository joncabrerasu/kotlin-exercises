package exercises.functional

fun multCustom(x: Int, y: Int) = x * y

fun operation() : (Int, Int) -> Int {
    return ::multCustom
}

fun main(args: Array<String>) {
    val operation = operation()
    println(operation(2,2))
}