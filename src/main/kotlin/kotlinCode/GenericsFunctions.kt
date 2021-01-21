package kotlinCode

fun main() {
    val animals = listOf(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, Animal("Råtta", 4))
    val ints = listOf(1,2,3,4,5,6,7,8,9,10)
    val strings = listOf("arne","bengt","clas","david","erik","filip","gustav")

    println(strings.myFilter { it.length > 4 })
    println(animals.myFilter { it.amountOfLegs > 4 })
    println(ints.myFilter { it % 2 == 0 })
    println(ints.myFilterAway { it % 2 == 0 })

    println(animals.myMap {l -> l.amountOfLegs})
    println(animals.myMap {l -> l.sort})
    println(strings.myMap {l -> l.length})

    val x = strings.myMap {it.length}

    println("Bör bli 9: ${x[0] + x[1]}")

    println(strings.myMap { it.length }.sum())
    println(strings.myMap { it.length }.average())

    val z = ints.myFilterAway { it == 2 || it == 3 }.myFilterAway { it == 4 }
    println(z)

}

private fun <T> List<T>.myFilter(predicate: (T) -> Boolean):List<T>{
    val list = mutableListOf<T>()
    for(element in this){
        if(predicate(element)) list.add(element)
    }
    return list
}

private fun <T> List<T>.myFilterAway(predicate: (T) -> Boolean):List<T>{
    val list = mutableListOf<T>()
    for(element in this){
        if(!predicate(element)) list.add(element)
    }
    return list
}

private fun <T,E> List<T>.myMap(function: (T) -> E): List<E>{
    val list = mutableListOf<E>()
    for(element in this){
        list.add(function(element))
    }
    return list
}

/*
fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean {
    for (element in this) {
        if (predicate(element))
        return true
    }
    return false
}

 */

/*
9a Skriv en egen version av funktionen ”filter”
9b Skriv en egen version av funktionen ” map
Använder inte predicate utan function (T) -> (T)
I ditt mainprogram , skapa upp en lista och se att det funkar att göra filter eller map på listan

Om generics känns svårt, börja med att definiera upp map och filter för listor som bara tar t.ex Int eller String
Nästa steg är att kunna hantera alla sorters objekt
 */