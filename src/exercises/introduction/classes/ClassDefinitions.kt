package exercises.introduction.classes

// Classes
// The class declaration consists of the class name, the class header
// (specifying its type parameters, the primary constructor etc.) and the class body, surrounded by curly braces.
// Both the header and the body are optional; if the class has no body, curly braces can be omitted.

class Customer

class Contact(val id: Int, var email: String)

fun main(args: Array<String>) {
    val customer = Customer()
    val contact = Contact(1, "joncabrerasu@gmail.com")
    println(contact.id)
    contact.email = "jcabrerasu@gmail.com"
}