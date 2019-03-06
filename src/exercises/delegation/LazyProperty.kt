package exercises.delegation


// Standard Delegates
// The Kotlin standard library contains a bunch of useful delegates, like lazy, observable, and other.
// You may use them as is. For example lazyis used for lazy initialization.
class LazySample {
    init {
        println("Init lazy sample class")
    }

    val lazy : String by lazy {
        println("firs init of lazy property")
        "lazy value"
    }
}

fun main(args: Array<String>) {
    val lazySample = LazySample()
    println(lazySample.lazy)
    println(lazySample.lazy)
}