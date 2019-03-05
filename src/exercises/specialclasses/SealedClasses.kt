package exercises.specialclasses

// Sealed Classes
// Sealed classes let you restrict the use of inheritance. Once you declare a class sealed, nobody else can create its subclasses.
// The key benefit of using sealed classes comes into play when you use them in a when expression. If it's possible
// to verify that the statement covers all cases, you don't need to add an else clause to the statement.

sealed class Mammal(val name: String)

class Cat(val catName : String) : Mammal(catName)

class Human(val humanName: String, val job: String) : Mammal(humanName)

fun whichMammalIsIt(mammal: Mammal) {
    when (mammal) {
        is Cat -> println("is a cat")
        is Human -> println ("is a human")
    }
}

fun main(args: Array<String>) {

    val cat = Cat("Garfield")
    val human = Human("Jon", "Software Engineer")

    whichMammalIsIt(cat)

}