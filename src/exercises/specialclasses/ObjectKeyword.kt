package exercises.specialclasses

import java.util.*

class SomethingRandom {
    fun getNumber() : Int {
        val random = Random()
        return random.nextInt(90)
    }
}

object SomethingRandomWithObject {
    fun getNumber() : Int {
        val random = Random()
        return random.nextInt(90)
    }
}

fun rentPrice(standarDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standardRate = standarDays * 30
        var festivityRate = festivityDays * 60
        var specialDays = specialDays * 90
    }

    println("${dayRates.standardRate} ${dayRates.festivityRate} ${dayRates.specialDays}")
}

object PrintObject {
    fun log() { println("Log!")}
}

class Printer {
    companion object {
        fun printLog() { println("Printing log with a companion object!")}
    }
}

fun main(args: Array<String>) {
    val somethingRandom1 = SomethingRandom()
    val somethingRandom2 = SomethingRandom()
    println(somethingRandom1.getNumber())
    println(somethingRandom2.getNumber())

    rentPrice(1,2,3 )

    PrintObject.log()

    println(SomethingRandomWithObject.getNumber())
    println(SomethingRandomWithObject.getNumber())

    Printer.printLog()

}