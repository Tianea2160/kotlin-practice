package beakjun.p2292

fun calcDepth(num: Int): Int {
    var cnt = 1
    var depth = 1
    while (cnt < num) {
        cnt += 6 * depth
        depth++
    }
    return depth
}

fun main() {
    val num = readln().toInt()
    println(calcDepth(num))
}