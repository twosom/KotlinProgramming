package chap03.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"

    println(source.getLongString(target))

    source.somangSoFun()
}


//String클래스를 확장해 getLongString() 함수 추가
fun String.getLongString(target: String): String =
    if(this.length > target.length) this else target


fun String.somangSoFun(): Unit {
    println("Somang so Funny")
}