package exercises.controlflow

// Equality Checks
// Kotlin uses == for structural comparison and === for referential comparison.
// More precisely, a == b compiles down to a == null ? b == null : a.equals(b).

fun main(args: Array<String>) {
    val authors = setOf("Millar", "Pacheco", "Perez")
    val others = setOf("Pacheco", "Perez", "Millar")
    val copyOfAuthors = authors

    println(authors == others)
    println(authors === others)
    println(authors === copyOfAuthors)

}