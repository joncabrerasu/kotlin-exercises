package exercises.functional

// Extension Functions and Properties
// Kotlin lets you add new members to any class with the extensions mechanism. Namely,
// there are two types of extensions: extension functions and extension properties. They look a lot like normal
// functions and properties but with one important difference: you need to specify the type that you extend.

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPriceOfItem() = this.items.maxBy { it.price }?.price ?: 0F

fun Order.itemNameWithMaxPrice() = this.items.maxBy { it.price }?.name ?: "No items"

val Order.itemNames : String
    get() = this.items.map { it.name }.joinToString()

fun main(args: Array<String>) {
    val item1 = Item("item1", 100F)
    val item2 = Item("item2", 50F)

    val order = Order(listOf(item1, item2))
    println("Max price of items: ${order.maxPriceOfItem()}")
    println("Item name with max price: ${order.itemNameWithMaxPrice()}")
    println("Item names: ${order.itemNames}")
}


