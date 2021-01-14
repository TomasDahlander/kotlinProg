package kotlinCode.rekursion

fun main() {
    val a = checkIfStringIsParenthesisBalanced("((hej))")
    val b = checkIfStringIsParenthesisBalanced("()hej()")
    val c = checkIfStringIsParenthesisBalanced("hej(()")

    println(a) // true
    println(b) // true
    println(c) // false

}

fun checkIfStringIsParenthesisBalanced(word: String): Boolean{

    tailrec fun check(word: String, i: Int, start: Int, end: Int): Boolean{
        if(i<0) return start==end
        else if(word[i] == '(') return check(word,i-1,start+1,end)
        else if(word[i] == ')') return check(word, i-1,start,end+1)
        else return check(word,i-1,start,end)
    }
    return check(word,word.length-1,0,0)
}


/*
Skriv en rekursiv funktion som tar en sträng och kollar om antalet
parenteser är balanserade
 */