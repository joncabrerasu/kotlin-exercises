package exercises.introduction.generics


// Generics
// Generics are a genericity mechanism that's become standard in modern languages. Generic classes and functions
// increase code reusability by encapsulating common logic that is independent of a particular generic type,
// like the logic inside a List<T> is independent of what T is.

class GenericStack<E>(vararg items : E) {
    private val elements = items.toMutableList()

    fun push(item : E) = elements.add(item)

    fun peek() : E = elements.last()

    fun pop() : E = elements.removeAt(elements.size -1 )

    fun isEmpty() : Boolean = elements.isEmpty()

    fun size() : Int = elements.size

    override fun toString(): String {
        return "[GenericStack] ${elements.joinToString()}"
    }
}

fun main(args: Array<String>) {
    val stackString : GenericStack<String> = GenericStack("robert", "pepe", "carol")
    println(stackString.toString())
}
