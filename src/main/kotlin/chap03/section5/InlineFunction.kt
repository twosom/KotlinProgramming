package chap03.section5

fun main() {
    //인라인 함수 shortFunc()의 내용이 복사되어 shortFunc으로 들어감
    shortFunc(a = 3, out = { x: Int -> println("First call : $x") })

    shortFunc(5) { x: Int -> println("Second call: $x") }

    sub(out1={println("out1()")}){ println("out2()")}


}
                            //fun out(Int x):Unit
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

inline fun sub(out1: () -> Unit, out2: () -> Unit) {
    out1()
    out2()
}