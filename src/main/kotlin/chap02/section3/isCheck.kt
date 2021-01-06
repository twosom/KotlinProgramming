package chap02.section3

fun main() {
    val num = 25

    if (num is Int) {
        println(num)
    }else if (num !is Int) {
        print("Not a Int")
    }

    var y: String? = null

    val x: String? = y as? String

}
