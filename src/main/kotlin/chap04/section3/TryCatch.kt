package chap04.section3


import kotlin.ArithmeticException

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("finally 블록은 반드시 항상 실행됨.")
    }
}