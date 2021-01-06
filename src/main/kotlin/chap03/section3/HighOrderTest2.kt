package chap03.section3

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a,b)
}

fun main() {
    var result: Int
    result = highOrder(sum = {x, y -> x + y }, 10, 20) //람다식을 매개변수와 인자로 사용
    println(result)
}