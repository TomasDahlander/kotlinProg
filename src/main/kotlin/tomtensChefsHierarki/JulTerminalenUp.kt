package tomtensChefsHierarki

import kotlin.system.exitProcess

val upMap = mapOf(
    "Bladlusen" to "Myran", "Myran" to "Räven",
    "Gråsuggan" to "Räven", "Dammråttan" to "Skumtomten",
    "Skumtomten" to "Trötter", "Räven" to "Butter",
    "Haren" to "Butter", "Nyckelpigan" to "Butter",
    "Rådjuret" to "Butter", "Tröger" to "Glader",
    "Trötter" to "Glader", "Blyger" to "Glader",
    "Glader" to "Tomten", "Butter" to "Tomten"
)

fun main() {
    while (true) {
        print("Ange namn på en undersåte för att få en lista på alla dennes chefer eller avsluta med ctrl-d: ")
        val name = readLine() ?: exitProcess(1337)
        println(getSubjects(name.trim()))
    }
}

fun getSubjects(subject : String) : List<String> {

    fun getList(subject: String, list: MutableList<String>): MutableList<String>{
        try {
            val boss = upMap.getValue(subject.substring(0, 1).toUpperCase() + subject.substring(1).toLowerCase())
            list.add(boss)
            return getList(boss,list)
        }catch (e : Exception){
            return list
        }
    }
    return getList(subject,mutableListOf())
}

/*
Tomtarna på Nordpolen har en strikt chefs-hierarki:
Högsta chefen för allt är "Tomten"
Under "Tomten" jobbar "Glader" och "Butter"
Under "Glader" jobbar "Tröger", "Trötter" och "Blyger"
Under "Butter" jobbar "Rådjuret", "Nyckelpigan", "Haren" och "Räven"
Under "Trötter" jobbar "Skumtomten"
Under "Skumtomten" jobbar "Dammråttan"
Under "Räven" jobbar "Gråsuggan" och "Myran"
Under "Myran" jobbar "Bladlusen"
 */