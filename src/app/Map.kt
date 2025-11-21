package app

fun main(){
    val map : Map<String,String> = mapOf(
        "a" to "Azmi",
        "b" to "fajarul"
    )
    for ((key,value) in map){
        println("$key to $value")
    }
}