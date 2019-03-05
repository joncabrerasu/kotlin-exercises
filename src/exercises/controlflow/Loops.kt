package exercises.controlflow

// Loops
// Kotlin supports all the commonly used loops: for, while, do-while

fun printAnimal(number : Int) { println("Animal $number")}

class Animal(val name: String) {
    override fun toString(): String {
        return "[Animal] $name"
    }
}

class Zoo(val animals: List<Animal>) {
    operator fun iterator() : Iterator<Animal> = animals.iterator()
}


fun main(args: Array<String>) {
    val animals = listOf("Lion", "Monkey", "Elephant")
    for (animal in animals) {
        println(animal)
    }

    var number = 0
    while (number < 3) {
        printAnimal(number)
        number++
    }

    do {
        printAnimal(number)
        number--
    } while (number >= 0)

    val zoo = Zoo(listOf(Animal("Lion"), Animal("Tiger"), Animal("Elephant")))
    for (animal in zoo) {
        println(animal)
    }
}