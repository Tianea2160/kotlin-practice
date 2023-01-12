package beakjun.p2839

import kotlin.math.min

fun calc(kg: Int, dp: Array<Int?>): Int {
    if (kg < 0) return -1
    if (dp[kg] == null) {
        val a = calc(kg - 5, dp)
        val b = calc(kg - 3, dp)
        when {
            a == -1 && b == -1 -> dp[kg] = -1
            a == -1 -> dp[kg] = b + 1
            b == -1 -> dp[kg] = a + 1
            else -> dp[kg] = min(a, b) + 1
        }
    }
    return dp[kg]!!
}

fun main() {
    val kg = readln().toInt()
    val dp = Array<Int?>(size = 5000 + 1) { null }
    for (i in 0..5) dp[i] = -1
    dp[3] = 1
    dp[5] = 1
    val result = calc(kg, dp)
    println(result)
}