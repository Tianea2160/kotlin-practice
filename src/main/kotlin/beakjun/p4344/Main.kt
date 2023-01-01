package beakjun.p4344

import java.util.Scanner
import kotlin.math.round

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val data: MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until n) data.add(mutableListOf())

    for (i in 0 until n) {
        val count = sc.nextInt()
        for (j in 0 until count) data[i].add(sc.nextInt())
    }

    for (i in 0 until n) {
        val average = data[i].average()
        val size = data[i].size
        val count = data[i].stream().filter { it > average }.count()
        val result: Double = round(count / size.toDouble() * 100.0 * 1000.0) / 1000.0
        println("%.3f%%".format(result))
    }
}