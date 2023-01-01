package beakjun.p1065

fun isHan(num: Int): Boolean {
    // 한자리 숫자면 그냥 참이라고 반환
    if (num in 0..9) return true

    // 두자리 수 이상이라면
    val diff: Int = num % 10 - num / 10 % 10 // 두수의 차이를 구해서 등차를 구함
    var tmp = num
    while (tmp / 10 != 0) {
        val prev = tmp % 10
        val next = tmp / 10 % 10
        if (prev - next != diff) return false
        tmp /= 10
    }
    return true
}

fun main() {
    val num = readln().toInt()
    var ans = 0
    for (i in 1..num) if (isHan(i)) ans++
    println(ans)
}