package chap04.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}


fun retFunc() {
    println("start of retFunc")
    inlineLambda(3, 5){a:Int, b:Int ->
        val result = a + b
        if(result > 10) return  //10보다 크면 이 함수를 빠져나감
        println("inlineLambda함수의 return이 실행되면 바깥의 retFUnc() 함수까지 빠져나가게 된다" +
                "이러한 반환을 비지역(Non-local)반환이라 일컫는다.")
        println("result : $result") //10보다 크면 이 문장까지 도달하지 못함.
    }
    println("end of retFunc")
}