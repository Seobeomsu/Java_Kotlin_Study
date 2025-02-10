package week_6

fun main() {
    println("N을 입력해주세요")
    val n = readln().toIntOrNull() ?:0
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)
}