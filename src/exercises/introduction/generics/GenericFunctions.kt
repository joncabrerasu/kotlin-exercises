package exercises.introduction.generics

// Generic Functions
// You can also generify functions if their logic is independent of a specific type.
// For instance, you can write a utility function to create mutable stacks:

fun <E> createGenericStack(vararg items : E) : GenericStack<E> {
    return GenericStack(*items)
}

fun main(args: Array<String>) {
    val stackOfNames : GenericStack<String> = createGenericStack("robert", "jessica", "christine")
    println(stackOfNames)
}