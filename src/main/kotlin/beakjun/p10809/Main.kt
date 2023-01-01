package beakjun.p10809

fun main() {
    val word = readln()
    val arr: Array<Int> = Array<Int>(size = ('z' - 'a' + 1)) { -1 }
    for ((idx, c) in word.withIndex())
        if (arr[c - 'a'] == -1)
            arr[c - 'a'] = idx
    println(arr.joinToString(" "))
}