package chap03.section5

fun main() {
    shortFunc2(3, out = { x:Int ->
        println("First call : $x")
        return  //인라인 함수에서 사용한 람다식에서는
                //return을 사용할 수 있다.
    })
}

inline fun shortFunc2(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")  //인라인으로 정의 된 out(a)의 람다 함수에서
                                    //return 문 까지 마쳤으므로 After calling out()은
                                    //실행되지 않는다.
                                    //이러한 반환을 비지역 반환(Non-local Retrun)이라 부름.
}