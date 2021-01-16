package tomtensChefsHierarki

import java.lang.Exception
import kotlin.system.exitProcess

val downMap = mapOf(
    "Tomten" to listOf("Glader","Butter"),
    "Glader" to listOf("Tröger","Trötter","Blyger"),
    "Butter" to listOf("Rådjuret","Nyckelpigan","Haren","Räven"),
    "Trötter" to listOf("Skumtomten"),
    "Skumtomten" to listOf("Dammråttan"),
    "Räven" to listOf("Gråsuggan", "Myran"),
    "Myran" to listOf("Bladlusen")
)

fun main() {
    while (true){
        print("Ange namn på en chef för att få en lista på alla dennes undersåtar eller avsluta med ctrl-d: ")
        val name = readLine() ?: exitProcess(1337)
        try {
            println(getEmployees(name.trim()))
        }catch(e : Exception){
            println("Finns ej i databasen...")
        }
    }
}

fun getEmployees(name: String):List<String>{

    fun getBelowList(name: String,list: MutableList<String>,i: Int): MutableList<String>{
        try {
            val employeeList = downMap.getValue(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase())
            list.addAll(employeeList)
            return getBelowList(list[i],list,i+1)
        }catch (e : NoSuchElementException){
            return getBelowList(list[i],list,i+1)
        }catch (e : IndexOutOfBoundsException){
            return list
        }
    }
    return getBelowList(name, mutableListOf(),0)
}