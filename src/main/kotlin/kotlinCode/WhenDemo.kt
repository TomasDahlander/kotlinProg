package kotlinCode

fun main() {
    val d1 = Animal("Häst",4)
    val d2 = Animal("Myra",6)
    val d3 = Animal("Spindel",8)
    val d4 = Animal("Apa",2)
    val d5 = Animal("Hamster",4)
    val d6 = Animal("Orm",1)
    val d7 = Animal("Bläckfisk",8)
    val d8 = Animal("Hund",4)
    val d9 = Animal("Katt",4)
    val d10 = Animal("Kängeru",2)

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

fun printSound(animal : Animal){
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