package chap03.section5

fun main() {
    shortFunc3(a = 3) {
        println("First call : $it")
    }

}

inline fun shortFunc3(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc(body = {
        out(a)
    })
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}