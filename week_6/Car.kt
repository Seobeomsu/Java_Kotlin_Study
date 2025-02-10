package week_6

data class Car(val brand: String, val speed: Int) {
    fun drive() {
        println("차의 브랜드는 $brand 이며 현재 속도는 $speed 입니다.")
    }
}

fun main(){
    val myCar = Car("쌈뽕한차",200)
    myCar.drive()
}