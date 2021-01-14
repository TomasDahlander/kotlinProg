package kotlinCode.rekursion

fun main() {
    val a = getNrFromFibonacciIndex(0)
    println(a)
}

fun getNrFromFibonacciIndex(index: Int): Int{

    tailrec fun getNr(index: Int, startIndex: Int, a: Int, b: Int): Int{
        if (index == startIndex) return a
        return getNr(index,startIndex+1,b,b+a)
    }
    return getNr(index,0,1,2)
}

/*
•Betrakta Fibonacci demon i facit
•Fibonacci talen är en sekvens där varje nytt tal räknas ut genom att
addera de två föregående talen i sekvensen
•De första talen är 1 och 2
•Sekvensen blir: 1, 2, 3, 5, 8, 13, 21 …
•Kopiera exemplet och skriv om
•Man ska kunna ange en siffra som betecknar ett index i fibonnacci
sekvensen som inparameter till din funktion
•Ditt program ska sedan skriva ut vilket fibonacci tal som är på den
plats som motsvarar det tal du skickade in
 */