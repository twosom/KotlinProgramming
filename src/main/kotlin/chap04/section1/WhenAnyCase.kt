package chap04.section1

fun main() {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())

}


fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int:$obj")
        "Hello" -> println("Stirng:$obj")
        is Long -> println("Long:$obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}