package chap03.section5

fun main() {
    //일반 표현법
//    val multi = 3.multiply(10)
//    println(multi)

    //중위 표현법
    val multi = 3 multiply 10   //3.multiply(10)보다 훨씬 보기에 직관적.'ㅌ
    println("multi : $multi")


}

//Int를 확장해서 multiply()함수를 하나 더 추가함
infix fun Int.multiply(x: Int): Int {
    return this * x
}