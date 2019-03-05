package exercises.scopefunctions

// Like let, run is another scoping function from the standard library. Basically, it does the same: executes a
// code block and returns its result. The difference is that inside run the object is accessed by this. This is
// useful when you want to call the object's methods rather than pass it as an argument.

fun printMessageWithRun(message: String?) {
    message?.run {
        println(this.toUpperCase())
    }
}

fun main() {
    printMessageWithRun("much better")
}

