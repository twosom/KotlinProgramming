package chap03.section3

fun sum1(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}

fun main() {
    //인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum1)
    println(res1)

    //인자가 없는 함수
    hello(::text)
    hello(body={x, y -> "Somang! $x $y"})

    //일반 변수에 값처럼 할당
    val likeLambda = ::sum1
    println(likeLambda(6, 6))
    println(::sum1) //출력 결과 : fun sum1(kotlin.Int, kotlin.Int): kotlin.Int


}


