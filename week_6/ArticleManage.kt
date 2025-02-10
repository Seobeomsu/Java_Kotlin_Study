package week_6

fun main(){
    val muteableMap = mutableMapOf<String,Double>()
    muteableMap.put("Meow" , 1000.0 )
    muteableMap.put("Meo" , 700.0 )
    muteableMap.put("Mew" , 500.0 )
    muteableMap.put("Mow" , 300.0 )
    muteableMap.put("eow" , 100.0 )
    muteableMap.forEach {
        println(it.key+" "+it.value)
    }
    muteableMap.forEach {
        if (it.value >= 500){
            println(it.key+" "+it.value)
        }
    }

    val newMap = mutableMapOf<String, Double>()
    muteableMap.forEach {
        newMap.put(it.key ,it.value * 1.1)
    }
    println(newMap)

    var new2Map = muteableMap.mapValues { it.value * 1.1 }
    println(new2Map)
}