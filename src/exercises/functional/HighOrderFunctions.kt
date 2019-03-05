package exercises.functional


// Higher-Order Functions
// A higher-order function is a function that takes another function as parameter and/or returns a function.

// Taking Functions as Parameters

fun calculate(x : Int, y: Int, operate : (Int, Int) -> Int) : Int {
    return operate(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    val sumResult = calculate(1, 2, :: sum)
    val multResult = calculate(3, 2) {x, y -> x * y}
    println("sumResult $sumResult multResult $multResult")
}