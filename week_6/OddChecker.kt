package week_6

fun main(){
    println("홀수짝수를 체크할 숫자를 입력해주세요")
    var x = readlnOrNull()?.toIntOrNull() ?:0
    var text = if(x % 2 == 0){
        "짝수"
    }else{
        "홀수"
    }
    println("입력한 숫자 $x 는 $text 입니다.")
}