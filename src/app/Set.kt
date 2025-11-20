package app

import data.Person

fun main(){
    val set : Set<Person> = setOf(
        Person("azmi"),Person("alhaq"),Person("Ganteng"),Person("Ganteng")
    )
    println(set.size)
    println(set)
}