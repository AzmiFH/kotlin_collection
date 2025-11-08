package app

fun main(){
    val mutableList : MutableList<String> = mutableListOf()

    mutableList.add("azmi") //tambah
    mutableList.add("fajarul")
   //mutableList[0] = "fajar"//rubah
    //mutableList.remove("azmi") hapus

    for(name in mutableList){
        println(name)
    }
}