package chap06.section1

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }

    val y: Int = 0
}


class Second : First() {
    override val x: Int = 0 //상위 클래스와 구현부가 다르게 오버라이딩
        get() {
            println("Second x")
            return field + 3
        }
    //override val y: Int = 0   //오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x)   //오버라이딩 된 두번째 클래스 객체의 x
    println(second.y)   //상위 클래스로부터 상속받은 값

}