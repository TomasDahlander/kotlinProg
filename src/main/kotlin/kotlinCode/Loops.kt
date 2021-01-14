package kotlinCode

fun main() {
    println("361: " + isPrimeNumber(361))
    println("359: " + isPrimeNumber(359))
    println("357: " + isPrimeNumber(357))
    println("355: " + isPrimeNumber(355))
    println("353: " + isPrimeNumber(353))
    println("353: " + isPrimeNumber(353))
    println("17: " + isPrimeNumber(17))

}

fun printEvenNumbers(){
    for(i in 20 downTo 1 step 2) println(i)
}

fun printMultiTable(x : Int, lowest : Int, highest : Int){
    for (i in lowest..highest) println(x*i)
}

fun isPrimeNumber(nr : Int) : Boolean{
    var x = 0
    if (nr % 2 == 0) return false;
    for (i in 3..nr/2 step 2){
        x++
        if (nr % i == 0){
            println(x)
            return false
        }
    }
    println(x)
    return true
}