package chap06.section3

open class Superman {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air.")
}

fun main() {
                                //Superman 클래스 상속.
    val pretendedMan = object : Superman() {    //Object로 fly()구현의 재정
        override fun fly() = println("I'm not a real superman. I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()

    foo()
}

interface Shape {
    fun onDraw()    //구현해야 할 메서드
}

val triangle = object : Shape {
    override fun onDraw() { //여기서 딱 한 번 구현됨.

    }
}

//객체는 필요하지만 상위인터페이스나 클래스가 없는 경우는 다음과 같이 사용할 수 있다.
fun foo() {
    val adHoc = object{
        var x: Int = 0
        var y: Int = 0
    }
    print("adHoc.x = ${adHoc.x}, adHoc.y = ${adHoc.y}")
}