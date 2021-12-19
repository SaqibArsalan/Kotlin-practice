
class Animal
{
    var name: String = ""
    var age: Int = 0
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    fun run() {
        println("Animal runss")
    }
}

class Human(
    var name: String = "",
    var age: Int = 0
)
{


    fun think() {
        println("Person thinks")
    }
}

fun main(args: Array<String>) {
    var animal = Animal("Cow", 40)
    animal.run()
    println("Name is " + animal.name)

    var human = Human()
    human.name = "Saqib"
    println("Name of person " + human.name)
    println("Hello World!")
}