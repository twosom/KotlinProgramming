package chap03.section5

fun main() {
    var number = 54
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")


    number = 18
    println("fibonazzi($number) = ${fibonazzi(number)}")



}


fun factorial(n: Int): Long {
    if (n == 1) {
        return n.toLong()
    } else {
        return n * factorial(n - 1)
    }
}


fun fibonazzi(n: Int): Long {
    if (n == 1 || n == 2) {
        return 1
    }
    return fibonazzi(n-1) + fibonazzi(n - 2)
}