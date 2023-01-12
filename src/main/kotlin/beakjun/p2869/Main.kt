package beakjun.p2869

import kotlin.math.ceil

fun main() {
    val (a, b, v) = readln().split(" ").map { it.toInt() }
    val n:Double = (v - b) / (a - b).toDouble()
    print(ceil(n).toInt())
}