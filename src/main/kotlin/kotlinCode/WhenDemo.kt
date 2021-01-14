package kotlinCode

fun main() {
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

    val list = listOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10)

    while(true){
        try {
            val x = readLine()!!.toInt()
            printSound(list[x])
        }catch(e : Exception){
            print("Couldn't understand that input... Try again: ")
        }
    }
}

fun printSound(animal : Djur){
    when (animal.sort){
        "Hund" -> println(animal.sort + " says Woof!")
        "Katt" -> println(animal.sort + " says Meow")
        "Häst" -> println(animal.sort + " says Gnegg")
        "Apa" -> println(animal.sort + " says Hohahaha")
        "Bläckfisk" -> println(animal.sort + " says Blub")
        "Orm" -> println(animal.sort + " says Sssssss")
        "Kängeru" -> println(animal.sort + " says Boink")
        else -> println("No knows what a "+animal.sort+" sounds like...")
    }
}

/*
•Skapa en funktion som tar ett Djur som inparameter
•Beroende på Djurets sort ska du skriva ut djurets läte
•Använd en When sats
 */

/*
fun main() {
val
yes = "yes"
val
no = "no"
val
choice = readLine
when (choice) {
yes
--> println ("
no
--> println ("Too
}
}
 */