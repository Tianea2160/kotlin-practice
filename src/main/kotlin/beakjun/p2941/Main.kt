package beakjun.p2941

fun main() {
    var word = readln()
    var ans = 0
    val set = setOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    while (word != "") {
        ans++
        for (w in set) {
            // 특정 문자열이 해당 문자의 시작에 포함되어 있다면?
            if (word.length >= w.length && word.startsWith(w)) {
                word = word.substring(w.length - 1)// 포함되는 문자 길이 만큼 삭제하고 다으므로 넘긴다.
                continue
            }
        }
        if (word.length <= 1) break
        word = word.substring(1)
    }
    println(ans)
}