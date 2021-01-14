package kotlinCode

fun main() {
    print("Skriv ditt namn: ")
    val guessed = readLine()
    println("Hej på dig $guessed")
    print("Skriv ett tal så ska jag sätta det i omloppsbana: ")
    val x = readLine()!!.toInt()
    multiplyAway(x)
}

fun multiplyAway(x : Int){
    for (i in 1..x) println(i*x)
}