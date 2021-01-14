package kotlinCode

class Dog

class Cat{
    val talk = "Meow"
}

class Hamster(var name : String){
    fun talk() = println("Squeek squeek")

}

class Fish(name : String){
    fun talk() = println("Blub blub")
    val greeting = "My name is $name"
}


fun main() {
    val dog = Dog()
    println(dog)

    val cat = Cat()
    println(cat.talk)

    val hamster = Hamster("Hugo")
    hamster.talk()
    println(hamster.name)
    hamster.name = "Stalin"
    println(hamster.name)

    val fish = Fish("Goldy")
    fish.talk()
    println(fish.greeting)
}