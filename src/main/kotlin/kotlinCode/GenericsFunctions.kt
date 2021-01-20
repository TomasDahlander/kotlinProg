package kotlinCode

private fun <T> List<T>.filter(predicate: (T) -> Boolean):List<T>{
    val list = mutableListOf<T>()
    for(element in this){
        if(predicate(element)) list.add(element)
    }
    return list
}

private fun <T,R> List<T>.map(function: (T) -> R): List<R>{
    val list = mutableListOf<R>()
    for(element in this){
        list.add(function(element))
    }
    return list
}

fun main() {

    val animals = listOf(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, Djur("Råtta", 4))
    val ints = listOf(1,2,3,4,5,6,7,8,9,10)
    val strings = listOf("arne","bengt","clas","david","erik","filip","gustav")

    println(ints.filter { it % 2 == 0 })
    println(strings.filter { it.length > 4 })
    println(animals.filter { it.amountOfLegs > 4 })

    println(animals.map {l -> l.amountOfLegs})
    println(animals.map {l -> l.sort})
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