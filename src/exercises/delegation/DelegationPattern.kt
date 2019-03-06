package exercises.delegation

// Delegation Pattern
// Kotlin supports easy implementation of the delegation pattern on the native level without any boilerplate code.

interface SoundBehaviour {
    fun makeSound()
}

class ScreamBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() {
        println("${n.toUpperCase()}")
    }
}

class RockAndRollBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() {
        println("Rock and Roll $n")
    }
}

class TomAraya(n: String) : SoundBehaviour by ScreamBehaviour(n)

class ElvisPresley(n: String) : SoundBehaviour by RockAndRollBehaviour(n)

fun main(args: Array<String>) {
    val tomAraya = TomAraya("scream")
    val elvisPresley = ElvisPresley("las vegas")
    tomAraya.makeSound()
    elvisPresley.makeSound()
}