package kotlinCode

import kotlin.math.*

fun printTestRange(range : IntRange){
    println("Random: " + range.random())
    println("ToString: " + range.toString())
    println("Step:" + range.step)
    println("Start: " + range.start)
    println("First: " + range.first)
    println("Last: " + range.last)
    println("endInclusive: " + range.endInclusive)
    println("Avereage: " + range.average())
    println("Sum: " + range.sum())
}

class Counter(initiatedValue : Int){
    var value: Int = initiatedValue
        get() {
            return field * 2
        }
        set(value) {
            field = value * 2
        }

    val startValue: Int = initiatedValue
        get() {
            return field
        }

    fun changeValueWith(value : Int) {
        this.value += value
    }

}

fun main (){
    val c = Counter(4)
    println(c.value)
    c.value = 4
    println(c.value)
    c.changeValueWith(3)
    println(c.value)


//    printTestRange(1..7)
}