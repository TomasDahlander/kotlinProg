package tomtensChefsHierarki

import kotlin.system.exitProcess

val map = mapOf(
    "Bladlusen" to "Myran", "Myran" to "Räven",
    "Gråsuggan" to "Räven", "Dammråttan" to "Skumtomten",
    "Skumtomten" to "Trötter", "Räven" to "Butter",
    "Haren" to "Butter", "Nyckelpigan" to "Butter",
    "Rådjuret" to "Butter", "Tröger" to "Glader",
    "Trötter" to "Glader", "Blyger" to "Glader",
    "Glader" to "Tomten", "Butter" to "Tomten"
)

fun main() {

    while (true){
        print("Ange namn på en undersåta för att få en lista på alla dennes chefer eller avsluta med exit: ")
        try{
            val name = readLine()!!.trim()
            if(name.equals("exit",true)) exitProcess(1337)
            println(getSubjects(name))
        }catch (e : Exception){
            println("Kunde ej tyda ert input...")
        }
    }

}

fun getSubjects(subject : String) : List<String> {

    fun getlist(subject: String, list: MutableList<String>): MutableList<String>{
        try {
            val boss = map.getValue(subject.substring(0, 1).toUpperCase() + subject.substring(1).toLowerCase())
            list.add(boss)
            return getlist(boss,list)
        }catch (e : Exception){
            return list
        }
    }
    return getlist(subject,mutableListOf())
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