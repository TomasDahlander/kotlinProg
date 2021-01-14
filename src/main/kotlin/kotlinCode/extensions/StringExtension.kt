package kotlinCode.extensions

fun String.doubleUp() = println("$this\n$this")
fun String.printRepeat(i : Int){
    for (s in 1..i) println(this)
}
fun String.getFirstHalf(): String{
    val i = this.length/2
    return this.substring(0,i)
}
fun String.getLastHalf(): String{
    val i = this.length/2
    return this.substring(i)
}

fun main() {
    "hej".doubleUp()
    "ohoj".printRepeat(4)
    val s1 = "hejsans".getFirstHalf()
    println(s1)
    val s2 = "hejsans".getLastHalf()
    println(s2)
}

/*
•5b: Skapa följande extension functions för String
•DoubleUp () Skriver ur en String två gånger
•5c: Skapa följande extension functions för String
•PrintRepeat (i : Int ) Skriver ur en String i antal gånger
 */