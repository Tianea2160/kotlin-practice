package beakjun.p1712

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }.toList()
    if (b >= c) println(-1) // 절대로 손익 분기점을 넘을 수 없는 경우
    else println(a / (c - b) + 1)
}