package chap04

fun main() {
    retFunc()
    retFunc2()

    fun greet() = fun( ){ println("Hello") }
    greet()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3){ a: Int, b: Int ->  //람다식 블록의 시작 부분에 라벨을 지정.
        val result = a + b
        if(result > 10) return@inlineLambda  //라벨을 사용한 블록의 "끝부분"으로 반환
        println("result : $result")
    }   // <- 이 부분으로 빠져나감.
    println("end of retFunc")   // 이 부분이 실향.
}

fun retFunc2() {
    println("start of retFunc2")
    inlineLambda(13, 3, fun(a, b){
        val result = a + b
        if(result > 10) return
        println("result : $result")
    })  //inlineLambda()의 끝 부분.
    println("end of retFunc2")
}

//람다식 방법
val getMessage1 = lambda@{ num: Int ->
    if (num !in 1..100) {
        return@lambda "ERROR"  //라벨을 통한 반환
    }
    "SUCCESS"   //마지막
}
//익명함수 방법
val getMessage2 = fun(num: Int):String {
    if (num !in 1..100) {
        return "ERROR"
    }
    return "SUCCESS"    //익명함수의 장점!
                        //람다에 비해 2개의 return이 확실히 구별된다.
                        //보통의 경우는 람다식, return과 같은 명시적으로 반환해야 할 것이 여러 개라면 익명함수 쓰자
}

