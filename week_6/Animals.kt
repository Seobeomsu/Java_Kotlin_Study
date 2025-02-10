package week_6

interface Animal {
    fun makeSound(){
        println("make sound")
    }
}

interface Pet {
    fun play(){
        println("play")
    }
}

class Dog : Animal, Pet{
    override fun play(){
        println("강아지와 놀기")
    }
    override fun makeSound(){
        println("컹컹컹컹컹ㅋ엉ㅋㅋ어")
    }
}

class Bird : Animal {
    override fun makeSound(){
        println("짹짹")
    }
}

fun main(){
    var animals: List<Animal> = listOf(Dog(), Bird())
    animals.forEach {
        animal ->
        animal.makeSound()
        if(animal is Dog){
            animal.play()
        }
    }
}