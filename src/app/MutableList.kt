package app

fun main(){
    val mutableList : MutableList<String> = mutableListOf()

    mutableList.add("azmi") //tambah
    mutableList[0] = "fajar"//rubah
    //mutableList.remove("azmi") hapus

    println(mutableList)
}