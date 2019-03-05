package exercises.introduction.functions

// Infix Functions
// Member functions and extensions with a single parameter can be turned into infix functions.

fun main(args: Array<String>) {

    infix fun Int.times(word: String) = word.repeat(this)
    println(2 times "Bye ")

    infix fun String.mult(number: Int) = number * this.toInt()
    println("5" mult 2)

    val pair = "Ferrari" to "Testarrosa"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val customPair = "Mercedes" onto "SLK"
    println(customPair)

    val robert = Persona("robert")
    val christine = Persona("christine")
    val jessica = Persona("jessica")
    robert like christine
    robert like jessica
    println("Liked people 1")
    robert.likePeople.forEach{println("${it.name}")}

    infix fun Persona.dislike(other: Persona) = this.likePeople.remove(other)
    robert dislike jessica

    println("Liked people 2")
    robert.likePeople.forEach{ println("${it.name}")}

}

class Persona(val name: String) {
    val likePeople = mutableListOf<Persona>()

    infix fun like(other: Persona) = likePeople.add(other)
}