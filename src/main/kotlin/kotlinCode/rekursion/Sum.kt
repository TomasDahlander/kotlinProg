package kotlinCode.rekursion

fun main() {
    val list = listOf(1,2,3,4)
    val sum = accumulateSumFromList(list)
    println(sum)
}

fun accumulateSumFromList(list: List<Int>): Int{

    tailrec fun getSum(list: List<Int>,i: Int, sum: Int):Int{
        if(i < 0) return sum
        val newSum = sum + list[i]
        return getSum(list,i-1,newSum)
    }

    return getSum(list,list.size-1,0)
}

/*
Skriv en rekursiv funktion som tar en lista av ints och returnerar
summan av talen i listan
 */