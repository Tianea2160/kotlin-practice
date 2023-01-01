package beakjun.p4673

fun convert(num: Int): Int {
    var result = num
    var tmp = num

    while (tmp != 0) {
        result += tmp % 10
        tmp /= 10
    }
    return if (result > 9999) 0 else result
}

fun main() {
    val max = 10000
    val isSelf = BooleanArray(max) { true }
    for (i in 1..9999) {
        if (isSelf[i]) println(i)
        isSelf[convert(i)] = false
    }
}