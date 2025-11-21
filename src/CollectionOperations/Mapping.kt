package CollectionOperations

fun main(){
    val list1  = listOf("azmi","ganteng","faajrul")
    val list2 = list1.map { it.uppercase() }
    println(list2)
    val list3 = list1.mapIndexed { index, s -> index % 2==0 }
    println(list3)
}