package chap06

data class Person(var name: String, var age: Int)

lateinit var person1: Person

fun main() {
    person1 = Person("Kildong", 30)
    person1 = Person("Dooly", 100)
    println(person1.name + " is " + person1.age)
}

