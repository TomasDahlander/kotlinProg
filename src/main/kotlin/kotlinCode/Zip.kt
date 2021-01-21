package kotlinCode

fun main() {
    val sorts = listOf("Zebra","Häst","Myra","Spindel","Apa","Groda")
    val legs = listOf(4,4,6,8,2,4)

    val animalList = zipToAnimals(sorts,legs)
    for (d in animalList) println(d.getAllInfo())

    val ints = listOf(2,3,8,45,123,256,2345)
    val diffList = zipToTheDifferenceOfSortedList(ints)
    println(diffList)

    val multiList = zipToTheProduct(ints)
    println(multiList)

    println(zipToTheSum(ints))

}

private fun zipToAnimals(listWithSorts: List<String>, listWithLegs: List<Int>) =
    listWithSorts.zip(listWithLegs){sort,legs -> Animal(sort,legs)}

private fun zipToTheDifferenceOfSortedList(list: List<Int>) = list.zipWithNext{a,b -> b-a}

private fun zipToTheProduct(list: List<Int>) = list.zipWithNext{a,b -> a * b}

private fun zipToTheSum(list: List<Int>) = list.zipWithNext{a,b -> a+b}

/* A
•Skapa en lista av Strängar, som är olika namn på djur
•Skapa en annan lista med integers som är olika antal ben som djur kan ha
•Låt listorna vara lika långa
•Skriv en metod som zippar ihop de två listorna så att en ny lista skapas
•Denna lista är en List<Djur>
•Varje djurnamn och antal Ben i de gamla listorna är ihopparade
 */

/* B
•Skapa upp en lista med integers
•[2, 3, 8, 45, 123, 256,2345]
Genom att använda zipWithNext , skapa en lista som innehållerskillnaden mellan varje tal
•Alltså [1, 5, 37, 78, 133, 2089]
 */