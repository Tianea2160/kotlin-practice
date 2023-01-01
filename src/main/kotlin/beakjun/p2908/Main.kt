package beakjun.p2908

fun main() {
    val nums = readln().split(" ")
    var (first, second) = nums
    first = first.reversed()
    second = second.reversed()
    println(if(first > second) first else second)
}