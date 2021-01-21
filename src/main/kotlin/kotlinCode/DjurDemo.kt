package kotlinCode

import kotlin.math.max

class Djur(sort : String, legs : Int){
    var amountOfLegs = legs
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var sort = sort
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun toString() = sort

    fun printSort() = println(sort)
    fun printAmountOfLegs() = println(amountOfLegs)
    fun printAllInfo() = println("$sort med $amountOfLegs antal ben")
    fun getAllInfo() = "$sort med $amountOfLegs antal ben"
}

val d1 = Djur("Häst",4)
val d2 = Djur("Myra",6)
val d3 = Djur("Spindel",8)
val d4 = Djur("Apa",2)
val d5 = Djur("Hamster",4)
val d6 = Djur("Orm",1)
val d7 = Djur("Bläckfisk",8)
val d8 = Djur("Hund",4)
val d9 = Djur("Katt",4)
val d10 = Djur("Kängeru",2)

fun main() {
    val list = listOf(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, Djur("Råtta", 4))

    println(getHighestAmountOfLegsOfAnAnimal(list))
    println(getTotalAmountOfLegs(list))
    println(getAmountOfAnimalWithFourOrMoreLegs(list))
    println(getDoubleListOfAnimals(list))
}

private fun getHighestAmountOfLegsOfAnAnimal(list: List<Djur>) = list.map{it.amountOfLegs}.reduce{a,b -> max(a,b)}

private fun getTotalAmountOfLegs(list: List<Djur>) = list.map{it.amountOfLegs}.sum()

private fun getAmountOfAnimalWithFourOrMoreLegs(list: List<Djur>) = list.filter{it.amountOfLegs >= 4 }.count()

private fun getDoubleListOfAnimals(list: List<Djur>) = List(list.size*2){list[it % list.size]}


/*
6h Skriv en funktion som fördubblar antalet djur i den lista den returnerar
(kräver ingen
 */

private fun checkIfListContainsAnimal(animal: String, list: List<Djur>) = list.any{d -> d.sort.equals(animal,true)}

private fun getListWithout(animal: String, list: List<Djur>): List<Djur>{
    return list.filterNot {it.sort.equals(animal,true) }
}

private fun printWithIndex(list: List<Djur>){
    println(list.mapIndexed{i,d -> "$i. $d"})
    println()
    println(list.mapIndexed{i,_ -> "$i"})
}

private fun printAnimalsWithSeparator(list: List<Djur>){
    println(list.joinToString(separator = " - ") {it.sort.toUpperCase()})
    println(list.joinToString(separator = " | ", transform = {it.sort.toLowerCase()}))
}

private fun getListOfFrogs(list: List<Djur>) = list.map { Djur("Groda",4) }

private fun printListWithLambda(){
    val list = listOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,Djur("Råtta",4))
    list.forEach{it.printSort()}
}

private fun withList(){
    val list = listOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,Djur("Råtta",4))

//    list.forEach { e -> e.printAllInfo() }
//    println()
//    list.forEach { e -> println(e.getAllInfo())}
//    println(list.stream().mapToInt({e -> e.amountOfLegs}).sum())
//    println(list.stream().mapToInt({ e -> e.amountOfLegs}).average().asDouble)
//    println(list.stream().mapToInt({e -> e.amountOfLegs}).min().asInt)
//    println(list.stream().mapToInt({e -> e.amountOfLegs}).max().asInt)
    println(list.joinToString(" - "))
}

/*
Skapa en funktion som tar ett Djur som inparameter
•Beroende på Djurets sort ska du skriva ut djurets läte
•Använd en When sats
 */

private fun withSet(){
    val set1 = setOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d1,d2,d3)
    val set2 = setOf(d2,d1,d4,d3,d6,d5,d8,d7,d10,d9)

    set1.forEach{e -> e.printSort()}
    println()
    set2.forEach{e -> e.printSort()}
    println()
    println(set1.equals(set2))
}

private fun withMap(){
    val map1 = mapOf(
        "häst" to d1,
        "myra" to d2,
        "spindel" to d3,
        "apa" to d4,
        "hamster" to d5,
        "orm" to d6,
        "blackfisk" to d7,
        "hund" to d8,
        "katt" to d9,
        "kängeru" to d10
    )
    for ((key,value) in map1) println("$key = ${value.getAllInfo()}")
}

/*Testa joinToString på era Djur listor
•Testa att skriva ut mha joinToStrings default parametrar
•Testa att explicit sätta infix, postfix och separator
 */