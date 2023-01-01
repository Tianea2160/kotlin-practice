package beakjun.p1316

// 해당 문제는 어떻게 하나의 문자가 여러 영역을 나누고 있는지 판별하는가를 생각해내는 것이 핵심이다.
fun isGroupWord(word: String): Boolean {
    val set = word.toSet()
    for (c in set) {
        val size = word
            .replace(c, ' ') // 현재 문자를 공백으로 바꾸기
            .replace(regex = " +".toRegex(), " ") // 중첩된 공백을 하나의 공백으로 변경하기
            .split(' ').size // 하나의 공백을 기준으로 분리했을 때 분리된 영역의 개수 반환
        if (size > 2) return false
    }
    return true
}

fun main() {
    val n = readln().toInt()
    var ans = 0
    for (i in 0 until n) if (isGroupWord(readln())) ans++
    println(ans)
}