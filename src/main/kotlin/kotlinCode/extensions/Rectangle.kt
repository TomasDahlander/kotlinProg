package kotlinCode.extensions

class Rectangle(val width: Int = 3, val height: Int = 3){

    fun Rectangle(width: Int = 3, height: Int = 3) = "($width, $height)"
}

/*
fun
color (red: Int, green: Int, blue: Int)
"($red, $green, $blue)"

fun
color
red: Int = 0,
green: Int = 0,
blue: Int = 0
) = "($red, $green, $blue)"
 */

fun Rectangle.getArea() = width * height
fun Rectangle.getPerimeter() = (width*2) + (height*2)

fun main() {
    val r1 = Rectangle(3,5)
    println(r1.getArea())
    println(r1.getPerimeter())
    val r2 = Rectangle(height = 5, width = 4)
    println(r2.height)
    val r3 = Rectangle(height = 5)
    println(r3.width)
}

/*
Gå tillbaka till er klass Rectangle
•Testa att anropa rectangle med benämnda inparametrar
•Kolla att det går bra att kasta om ordningen på parametrarna till konstruktorn
 */

/*
•Skapa klassen Rectangle som har följande inparametrar
•Bredd
•Höjd
•Skapa extension functions till Rectangle som beräknar
•Area
•Omkrets
•Gör ett huvudprogram där du
•Skapar en Rectangle
•Skriver ut area och omkrets som du beräknar i dina funktioner
 */