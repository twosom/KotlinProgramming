package chap03.section6

import chap03.section3.mul

var global = 10 //패키지 Section6의 모든 범위에 적용되는 전역 변수

fun main() {
    val local1 = 20 //main()함수 블럭 안에서만 유지되는 지역변수
    val local2 = 21

    fun nestedFunc() {
        global += 1
        println("main() local1 : $local1")
        val local1 = 30 //func()함수 블럭 안에서만 유지(기존 local1이 가려짐)
        println("nestedFunc local1: $local1")
        println("nestedFunc local2: $local2")   //이 블럭 바로 바깥의 main()의 local2 사용
        println("nestedFunc global: $global")
    }
    nestedFunc()
    outsideFunc()

    println("main global: $global")
    println("main local1: $local1")
    println("main local2: $local2")
    println(mul1(10, 30))
    println(mul2(10, 20))


    oneParam(x = "somang"){name:String ->
        println("$name is my name")
    }


}

fun outsideFunc() {
    global += 1
    val outVal = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}
fun mul2(a: Int, b: Int) = a * b

val mul1 = { a: Int, b: Int -> a * b }


fun oneParam(x: String, out: (String) -> Unit) {
    out(x)
}
