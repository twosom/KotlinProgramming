package chap02.section3

fun main() {
    val a: Int = 24
    val b = a       //a와 b는 참조형으로 선언되었지만 코틀린 컴파일러에 의해 기본형으로 변환됨
    println(a === b)//자료형이 기본형인 int 형이 되어 값이 동일하므로 true

    val c: Int? = a //null을 허용한 c와 d는 참조형으로 저장됨.
    val d: Int? = a
    val e: Int? = c
    println(c == d) //값의 내용만 비교하는 경우 동일하므로 true
    println(c === d)    //값의 내용은 같지만 참조 주소를 비교해 다른 객체(주소 다름)이므로 false
    println(c === e)    //값의 내용도 같고 참조된 객체도 동일(주소 동일)하므로 true



}