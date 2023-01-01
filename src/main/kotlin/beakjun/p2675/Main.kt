package beakjun.p2675

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val t = sc.nextInt()
    for (i in 0 until t) {
        val n = sc.nextInt()
        val word = sc.next()

        var res = ""
        for (c in word) for (i in 1..n) res += c
        println(res)
    }
}