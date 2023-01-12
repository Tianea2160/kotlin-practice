package beakjun.p2775


fun calc(k: Int, n: Int, dp: Array<Array<Int>>): Int {
    var result = 0
    if (n < 1 || k < 0) return 0
    if (k == 0) return n

    if (dp[k][n] == 0) {
        for (i in 1..n) result += calc(k - 1, i, dp)
        dp[k][n] = result
    }
    return dp[k][n]
}

fun main() {
    val t = readln().toInt()
    for (i in 1..t) {
        val k = readln().toInt()
        val n = readln().toInt()

        val dp = Array(size = k + 1) { Array(size = n + 1) { 0 } } // 2차원 배열 선언
        val res = calc(k, n, dp)
        println(res)
    }
}