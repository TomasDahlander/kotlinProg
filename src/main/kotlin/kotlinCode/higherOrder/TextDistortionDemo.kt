package kotlinCode.higherOrder

fun main() {

    fun makeToUpperCase(text: String) = text.toUpperCase()

    fun removeAllWhitespaces(text: String) = text.filter { !it.isWhitespace() }

    fun makeFirstCharToUpperCase(text: String) = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase()

    fun textDistortion(text:String ,perform : (String) -> String){
//        print("Skriv en mening: ")
//        val sentence = readLine().toString()
        println(perform(text))
    }


    textDistortion("hejsan svejsan ditt fule fan",::makeToUpperCase)
    textDistortion("ohoj ugly boy",::removeAllWhitespaces)
    textDistortion("stolens alla ben utan kanter",::makeFirstCharToUpperCase)

}



/*
    val addition: (x : Double, y: Double) -> Double = {x, y -> x + y}
    val subtraction: (x : Double, y: Double) -> Double = {x, y -> x - y}
    val multiplication: (x : Double, y: Double) -> Double = {x, y -> x * y}
    val division: (x : Double, y: Double) -> Double = {x, y -> x / y}

    fun calculator(calculate : (Double, Double) -> Double){
        println("Skriv in ett värde:")
        val x = readLine()!!.toDouble()
        println("Skriv in ytterligare ett värde:")
        val y = readLine()!!.toDouble()

        println(calculate(x,y))
    }

    calculator(addition)
    calculator(subtraction)
    calculator(multiplication)
    calculator(division)
 */

/******************************************************************************************************/

/*
Skriv en metod: TextDistortion
TextDistorsion tar in en funktion som i sin tur tar in en String och lämnar ifrån sig en String
I TextDistorsion anropas funktionen
Skriv följande metoder som kan användas som inparametrar till TextDistorsion
* ToUpperCase (String) : String
* RemoveAllWhitespaces String) : String
 */