package chap03.section3

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()  //이게 실행이 되어야지 otherLambda 구문이 실행된다.
}

val otherLambda: () -> Boolean = {  //람다식 자료형으로 선언된 매개변수
    println("otherLambda function")
    true
}


fun main() {
    val result = callByName(otherLambda)    //람다식 이름으로 호출
    println(result)
}
