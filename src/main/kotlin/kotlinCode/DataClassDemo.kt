package kotlinCode

data class Person(val name: String, val persNr : String)

fun main() {
    val p1 = Person("Nisse","900102-5547")
    val p2 = Person("Anders","471212-3541")
    val p3 = Person("Anders","471212-3541")
    val p4 = p1

    println(p1.equals(p2))
    println(p2.equals(p3))
    println(p1.equals(p4))
}