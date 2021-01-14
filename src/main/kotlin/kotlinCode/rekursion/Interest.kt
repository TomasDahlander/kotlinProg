package kotlinCode

import kotlin.math.roundToInt

fun main() {
    val money = accumulateInterestWithTail(1000.0,5,1.1)
    println(money)

    val money2 = accumulateInterestWithoutTail(1000.0,5,1.1)
    println(money2)
}

fun accumulateInterestWithoutTail(startValue: Double, years: Int, interest: Double): Double{
    if(years == 0) return startValue
    return Math.round(accumulateInterestWithoutTail((startValue * interest),years - 1,interest)*100)/100.0
}

fun accumulateInterestWithTail(startValue: Double, years: Int, interest: Double): Double{

    tailrec fun interestAccumulator(startValue: Double, years: Int, interest: Double): Double{
        return if(years == 0) startValue
        else interestAccumulator((startValue * interest),years - 1,interest)
    }

    return (interestAccumulator(startValue, years, interest) * 100).roundToInt() /100.0
}


/*
•Skriv en rekursiv funktion beräknar ränta
•Inparametrar till funktionen är
•Initialt belopp
•Antal år
•Ränta
 */