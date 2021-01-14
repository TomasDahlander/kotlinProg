package kotlinCode.rekursion

fun main() {
    val list = listOf(3,7,2,5)
    val nr = getMaxFromList(list)
    println(nr)
}

fun getMaxFromList(list: List<Int>):Int{

    tailrec fun getMax(list: List<Int>, i: Int, max: Int): Int{
        if (i<0) return max
        return getMax(list,i-1, kotlin.math.max(list[i],max))
    }

    return getMax(list, list.size-1,0)
}


/*
Skriv en rekursiv funktion som tar en lista av ints och returnerar
maxvärdet av talen i listan
 */