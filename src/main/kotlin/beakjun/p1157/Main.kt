package beakjun.p1157

fun main() {
    val word = readln().uppercase()
    val map: MutableMap<Char, Int> = mutableMapOf()
    for (c in word) map[c] = (map[c] ?: 0) + 1
    val entry = map.maxBy { it.value }
    val maxCount = map.count { it.value == entry.value }
    println(if (maxCount > 1) "?" else entry.key)
}