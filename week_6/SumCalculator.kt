package week_6

fun main(){
    println("첫번째 숫자 입력")
    val x = readlnOrNull()?.toIntOrNull() ?:0;
    println("두번째 숫자 입력")
    val y = readlnOrNull()?.toIntOrNull() ?:0;
    println("합계 ${x+y}")
}