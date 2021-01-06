package chap03.section3

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {   //람다 표현식이 두줄
    println("lambda function")
    true//마지막 표현식 문장의 결과가 반환
}


fun main() {
    val result = callByValue(lambda())//람다식 함수를 호출
    println(result)
}