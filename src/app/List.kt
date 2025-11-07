package app

fun main(){
    val list : List<String> = listOf("azmi","fajarul","Haq")
    //cara ambil data list
    println(list.get(0))
    //atau seperti array
    println(list[1])
    //cek posisi data di list
    println(list.indexOf("fajarul"))
    //list boolean atau untuk mengecek data pada list
    println(list.contains("azmi"))
    //empety cek apakah data kosong atau tidak
    println(list.isEmpty())
    println(list.isNotEmpty())
}