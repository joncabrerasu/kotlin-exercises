package exercises.functional

// Lambda Functions
// Lambda functions ("lambdas") are a simple way to create functions ad-hoc. Lambdas can be denoted very concisely
// in many cases thanks to type inference and the implicit it variable.

fun main(args: Array<String>) {

    val upperCase1 : (String) -> String = { str : String -> str.toUpperCase() }
    val upperCase2 : (String) -> String = { str -> str.toUpperCase() }
    val upperCase3 = { str : String -> str.toUpperCase()}
    val upperCase4 : (String) -> String = { it.toUpperCase() }
    val upperCase5 : (String) -> String = String::toUpperCase

    println(upperCase1("house1"))
    println(upperCase2("house2"))
    println(upperCase3("house3"))
    println(upperCase4("house4"))
    println(upperCase5("house5"))

    val lambda1 : (String, Int) -> String = { str: String, number: Int -> "$str$number"}
    val lambda2 : (String, Int) -> String = { str, number -> "$str$number"}
    val lambda3 = {str: String, number: Int -> "$str$number"}

    println(lambda1("car", 1))
    println(lambda2("car", 2))
    println(lambda3("car", 3))

}
