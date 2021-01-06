package chap03.section3

fun sum(a: Int, b: Int) = a + b


fun funcFunc(): Int {
    return sum(2, 2)
}

fun main() {
    println("funcFunc: ${funcFunc()}")
}