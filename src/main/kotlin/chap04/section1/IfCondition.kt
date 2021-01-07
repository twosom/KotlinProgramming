package chap04.section1

fun main() {
    val a = 12
    val b = 7


    //블록과 함께 사용
    val max = if (a > b) {
        println("a선택")
        a
    } else {
        println("b선택")
        b
    }

    println(max)

}