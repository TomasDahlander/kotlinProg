package kotlinCode.rekursion

fun main() {
    val word = getReverseString("hello")
    println(word)
}

fun getReverseString(word: String): String{

    tailrec fun getReverse(word: String, i: Int, newWord: String):String{
        if (i<0) return newWord
        return getReverse(word,i-1,newWord + word[i])
    }
    return getReverse(word,word.length-1,"")
}

/*
Skriv en rekursiv funktion som skriver ut en sträng baklänges
 */