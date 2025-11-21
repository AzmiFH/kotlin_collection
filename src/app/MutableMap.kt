package app

fun main(){
    val mutmap : MutableMap<String, String> = mutableMapOf()
    mutmap.put("a","azmi")
    mutmap["b"] = "miawww"

    println(mutmap.get("a"))
}