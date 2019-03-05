package exercises.introduction.variables


fun main(args: Array<String>) {
    var mutVar : String = "mutable message"

    println(mutVar)
    mutVar = "message already changed"
    println(mutVar)

    val inmVar : String = "inmutable message"
    println(inmVar)
    // inmVar = "hahaha you cant idiot"

    val inmInteger = 3 // inferred type
    println(inmInteger)

    var notInitVar :Int
    // You cant use not initialized var
    // println(notInitVar)

}

