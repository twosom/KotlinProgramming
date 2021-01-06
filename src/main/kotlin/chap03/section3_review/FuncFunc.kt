import chap03.section3.funcFunc

fun main() {
    println("funFunc: ${funcFunc()}")
}



fun sum(a: Int, b: Int) = a + b
fun funFunc(): Int {
    return sum(2, 2)
}
