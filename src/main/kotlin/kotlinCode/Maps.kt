package kotlinCode

private val numbers = mapOf(
    1 to "eins", 2 to "zwei", 3 to "drei",
    4 to "vier", 5 to "fuenf", 6 to "sechs",
    7 to "sieben", 8 to "acht", 9 to "neun",
    10 to "zehn", 11 to "elf", 12 to "zwoelf",
    13 to "dreizehn", 14 to "vierzehn",
    15 to "fuenfzehn", 16 to "sechzehn",
    17 to "siebzehn", 18 to "achtzehn",
    19 to "neunzehn", 20 to "zwanzig"
)

private fun ordinal(i: Int): String =
    when (i) {                            // [1]
        1 -> "erste"                        // [2]
        3 -> "dritte"
        7 -> "siebte"
        8 -> "achte"
        20 -> "zwanzigste"
        else -> numbers.getValue(i) + "te"  // [3]
    }

fun main() {
    val animals = listOf(
        Animal("Myra",6),
        Animal("Myra",6),
        Animal("Spindel",8),
        Animal("Spindel",8),
        Animal("Bläckfisk",8),
        Animal("Bläckfisk",8),
        Animal("Bläckfisk",8),
        Animal("Häst",4),
        Animal("Zebra",4),
        Animal("Zebra",4),
        Animal("Zebra",4),
        Animal("Zebra",4),
        Animal("Krabba",6),
        Animal("Groda",4),
        )

    val listSortedBySort = animals.groupBy { it.sort }
//    printAnimalMapGroupedBySort(a)
    val listSortedByAmountOfLegs = animals.groupBy { it.amountOfLegs }
//    printAnimalMapGroupedByLegs(b)

//    printAnimalMapStartingWithSpecificLetter(a,'z')
//    printAnimalMapWithSpecificAmountOfCopiesInList(a,2)

//    println(checkIfMapContainsSpecifikAnimalSort(listSortedBySort,"bläckfisk"))
//    println(checkIfMapContainsOnlySpecifikAnimalSort(listSortedBySort,"Myra"))
    println(sumAmountOfLegsFromAnimalList(animals))
}

/* A
•Skapa en lista av olika sorters djur
•Skapa en map som är grupperad på sort av djur
•Nyckel: sort, Värde: Djur
•Skriv en utskriftsfunktion som traverserar den grupperade mappen
och skriver ut varje nyckel, följt av antal djur som ligger i nyckelns
värde
 */
private fun printAnimalMapGroupedBySort(map: Map<String,List<Animal>>){
    for (d in map) println("${d.key}: ${d.value.size} antal")
}
/* B
•Skapa en map som är grupperad på antal ben
•Nyckel: antalBen , Värde: Djur
•Skriv en utskriftsfunktion som traverserar den grupperade mappen
och skriver ut varje nyckel, följt av de sorter av djur som är sorterade
under varje nyckel
•Helst inga dubblerade värden på djursorter
 */
private fun printAnimalMapGroupedByLegs(map: Map<Int,List<Animal>>){
    for (d in map) println("${d.key}: ${d.value.distinctBy { l -> l.sort }}")
}
/* C
•Utifrån de mappar du skapade i uppgift 11a b
•I mappen som har djurens sorter som nyckel
•Filtrera mappen så att den bara visar de djur som börjar på bokstaven K
•Filtrera mappen så att den bara visar de djur som det finns ett ex av
 */
private fun printAnimalMapStartingWithSpecificLetter(map: Map<String,List<Animal>>,startChar: Char){
    println(map.filterKeys { it.startsWith(startChar,true) })
}

private fun printAnimalMapWithSpecificAmountOfCopiesInList(map: Map<String,List<Animal>>,amountOfCopies: Int){
    println(map.filterValues { it.size == amountOfCopies }.keys)
}
/* D
•Skriv en funktion som kollar om du har en katt i din map
•Skriv en funktion som kollar om alla djur i mappen är katter
 */
private fun checkIfMapContainsSpecifikAnimalSort(map: Map<String, List<Animal>>, sort: String):Boolean{
    return map.any { (key,_) -> key.equals(sort,ignoreCase = true)}
}

private fun checkIfMapContainsOnlySpecifikAnimalSort(map: Map<String, List<Animal>>, sort: String):Boolean{
    return map.all { (key,_) -> key.equals(sort,true) }
}
/* E
•Gör en funktion där du adderar fram summan av dina djurs benantal
•Använd Fold
 */
private fun sumAmountOfLegsFromAnimalList(list: List<Animal>): Int{
    return list.map {it.amountOfLegs}.fold(0){acc,ele -> acc + ele}
}



