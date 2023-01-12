package beakjun.p1193

fun calc(n: Int): Pair<Int, Int> {
    var ja = 1
    var mo = 1
    var flag = true // ture -> right, false ->  left
    for (i in 1 until n) {
        if (ja == 1 && flag) {
            mo++
            flag = !flag
            continue
        }
        if (mo == 1 && !flag) {
            ja++
            flag = !flag
            continue
        }
        if (flag) {
            mo++
            ja--
        } else {
            ja++
            mo--
        }
    }
    return ja to mo
}

fun main() {
    val n = readln().toInt()
    val (ja, mo) = calc(n)
    println("${ja}/${mo}")
}