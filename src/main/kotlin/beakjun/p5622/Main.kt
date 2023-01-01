package beakjun.p5622

fun time(c: Char) = when (c) {
    in "ABC" -> 3
    in "DEF" -> 4
    in "GHI" -> 5
    in "JKL" -> 6
    in "MNO" -> 7
    in "PQRS" -> 8
    in "TUV" -> 9
    in "WXYZ" -> 10
    else -> -1
}

fun main() {
    val res = readln().toList().stream().mapToInt { time(it) }.sum()
    println(res)
}