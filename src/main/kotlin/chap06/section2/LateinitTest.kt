package chap06.section2

class Person {
    lateinit var name: String   //지연 초기화를 위한 선언
    //lateinit은 var정의에만 사용 가능

    fun test() {
        if (!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong"
    kildong.test()
    println("name=${kildong.name}")
}