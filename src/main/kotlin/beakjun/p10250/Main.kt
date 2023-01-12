package beakjun.p10250


fun main() {
    val t = readln().toInt()

    for (i in 1..t) {
        val (h, w, n) = readln().split(" ").map { it.toInt() }
        var mod = n % h
        var mok = n / h + 1
        if (mod == 0) {
            mod = h
            mok--
        }
        val result = "%d%02d".format(mod, mok)
        println(result)
    }
}