package chap06.section2

class Person {
    lateinit var name: String   //지연 초기화를 위한 선언
        //앞에 lateinit을 붙여주면 된다.
        //대신 GETTER, SETTER를 생성할 수 없다.
        //'lateinit' modifier is not allowed on properties with a custom getter or setter


    fun test() {
        if (!::name.isInitialized) {
            //코틀린에서 변수나 클래스명 앞에 더블콜론을 명시하면 변수에 대한 속성을 참조할 수 있다.
            //더블콜론을 명시하면 변수가 아닌 "객체"로 액세스 할 수 있기 때문이다.
            println("not initialized")
        } else {
            println("initialized")
        }

    }
}

fun main() {
    val kildong = Person()
    kildong.test()

    kildong.name = "Kildong"    //이 시점에서 초기화가 된다.(지연 초기화)
    kildong.test()
    println("name = ${kildong.name}")
}