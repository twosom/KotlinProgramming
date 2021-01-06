package chap02.section3

fun main() {
    checkArg("Hello");
    checkArg(512)

}

fun checkArg(x: Any) {
    println(x is Any)
    if (x is String) {  //is연산자를 사용하면서 형변환을 하고있다.
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}