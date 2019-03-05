package exercises.specialclasses

enum class State {
    PENDING,
    ACCEPTED,
    FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0xF00000),
    BLUE(0x0F0000);

    fun containsRed() = this.rgb and 0xFF0000 != 0

}

fun main(args: Array<String>) {

    val state = State.PENDING

    when(state) {
        State.PENDING -> println("PENDING")
        State.ACCEPTED -> println("ACCEPTED")
        State.FINISHED -> println("FINISHED")
    }

    val color = Color.RED
    println(color.containsRed())
}