package CollectionOperations

fun main (){
    val list = listOf<String>("apple", "orange", "banana")
    val accending = list.sorted()
    println(accending)

    val listNumber = listOf(1,2,3,4,5)
    val sorted = listNumber.sorted()
    println(sorted)
    val descending = listNumber.sortedDescending()
    println(descending)
}