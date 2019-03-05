package exercises.introduction.inheritance

// Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
open class Dog {
    open fun sayHello() { println("wow wow!") }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wow wow! (with yorkshire style)")
    }
}

open class Tiger(val origin : String) {
    open fun sayRoar() {
        println("Roar i'm a furious tiger from $origin")
    }
}

class AsianTiger : Tiger("China")


open class Lion(var name : String, val origin: String) {
    open fun sayHello() {
        println("groarrrr i'm a furious lion from $origin and my name is $name")
    }
}

// name in the American declaration is neither a var nor val: it's a constructor argument, whose value is passed to the name property of the superclass Lion.
class AmericanLion(name : String) : Lion(name, "America")

fun main(args: Array<String>) {

    val regularDog : Dog = Dog()
    regularDog.sayHello()
    val yorkshire : Dog = Yorkshire()
    yorkshire.sayHello()

    val asianTiger : Tiger = AsianTiger()
    asianTiger.sayRoar()

    val americanLion : Lion = AmericanLion(name = "leo")
    americanLion.sayHello()
}