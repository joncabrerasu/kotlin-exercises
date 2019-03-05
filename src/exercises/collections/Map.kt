package exercises.collections

const val factor = 15

val mutableMap : MutableMap<Int, Int> = mutableMapOf(1 to 10, 2 to 20, 3 to 30)

val inmutableMap : Map<Int, Int> = mutableMap

fun updateAccount(key: Int) {
    if(mutableMap.containsKey(key)) {
        println("key is present in the map")
        mutableMap[key] = mutableMap.getValue(key) + 15
    }else {
        println("key not present in the map")
    }
}

fun reportMap() {
    inmutableMap.forEach{
        k, v -> println("ID $k: credit $v")
    }
}

fun main(args: Array<String>) {
    reportMap()
    updateAccount(1)
    updateAccount(2)
    updateAccount(3)
    updateAccount(5)
    reportMap()
}

