package randomNrGame

import kotlin.system.exitProcess

fun main() {
    while (true){
        val code = npcCorrectAnswer()
        while (true){
            val guess = guess()
            if (guess == code) {
                if (declareWin()) exitProcess(1337)
                else break
            }
        }
    }
}

fun guess() : Int {
    print("Gissa på ett nummer mellan från 1 till och med 10: ")
    while (true) {
        try {
            return readLine()!!.toInt()
        } catch (e: Exception) {
            print("Det gick ej att tyda din gissning... Försök igen: ")
        }
    }
}

fun npcCorrectAnswer() = (1..10).random()

fun declareWin() : Boolean{
    println("Grattis det var korrekt svar!\nSkriv in 1 för att avsluta")
    while (true) {
        try {
            val choice = readLine()!!.toInt()
            return choice == 1
        } catch (e: Exception) {
            return false
        }
    }
}