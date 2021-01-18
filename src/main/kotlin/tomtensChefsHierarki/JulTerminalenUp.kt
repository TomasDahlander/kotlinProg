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
    val list = mutableListOf<String>()

    fun getList(subject: String): MutableList<String>{
        try {
            val boss = upMap.getValue(subject.substring(0, 1).toUpperCase() + subject.substring(1).toLowerCase())
            list.add(boss)
            return getList(boss)
        }catch (e : Exception){
            return list
        }
    }
    return getList(subject)
}