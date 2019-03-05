package exercises.controlflow

fun main(args: Array<String>) {

    // Int ranges
    for(i in 0..3) {
        print("$i ")
    }

    println("")

    for(i in 0..10 step 2) {
        print("$i ")
    }

    println("")

    for(i in 3 downTo 0) {
        print("$i ")
    }

    println("")

    // Char ranges
    for(i in 'a'..'z') {
        print("$i ")
    }

    println("")

    for(i in 'a'..'z' step 2) {
        print("$i ")
    }

    println("")

    val number = 3
    if(number in 0..4) {
        println("Number in range")
    }

    if(number !in 4..8) {
        println("Number not in range")
    }

}