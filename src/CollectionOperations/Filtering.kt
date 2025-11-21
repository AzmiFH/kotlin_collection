package CollectionOperations

fun main(){
    val list = listOf("azmi","fajarul","ganteng")
    val list2 = list.filter { it.length > 5 }
    val list3 = list.filterIndexed { index, s -> index % 2==0  }

    val listAny : List<Any?> = listOf(null,1,"azmi","fajarul","ganteng")
    val listStr = listAny.filterIsInstance<String>()
    val listInt = listAny.filterIsInstance<Int>()
    val ListNull = listAny.filterNotNull()
}