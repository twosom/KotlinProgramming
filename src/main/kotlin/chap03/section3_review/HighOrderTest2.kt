package chap03.section3_review



//매개변수에 람다식 함수를 이용한 고차 함수
fun highOrder1(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

fun highOrder2(mul: (Int, Int) -> Int, x: Int, y: Int): Int {
    return mul(x, y)
}

fun main() {
    var result: Int
    result = highOrder1(sum = { x: Int, y: Int -> x + y }, a=5, b=5)
    println(result)


    result = highOrder2(mul = { x: Int, y: Int -> x * y }, x = 12, y = 12)
    println(result) //144

}