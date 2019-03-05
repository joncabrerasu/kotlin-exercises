package exercises.scopefunctions


// apply
// apply executes a block of code on an object and returns the object itself.
// Inside the block, the object is referenced by this. This function is handy for initializing objects.

data class Bird(var name : String, var colour: String) {
    constructor() : this("", "")
}

fun printBirdSound(bird: Bird) {
    println("$bird makes woa woa")
}

fun main() {
    val bird = Bird()

    val description = bird.apply {
        name = "parrot"
        colour = "red"
    }.toString()

    println(description)


    val pajaro = Bird("parrot", "blue")
        .also {
            printBirdSound(it)
        }
}

