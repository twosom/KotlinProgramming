package chap06.section1

class FakeAge {
    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("Kim's real age = 15, pretended age = ${kim.age}")

    val hong = FakeAge()
    hong.age = 35
    println("Hong's real age =35, pretended age = ${hong.age}")

}

class Person {
    var name: String
    init{
        name = "NONAME" //프로퍼티 name이 NONAME으로 초기화
    }
}