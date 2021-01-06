package chap03.section3

fun main() {
    var result: Int
    val multi : (Int, Int) -> Int = {x:Int, y:Int -> x * y}
    result = multi(10, 20)  //람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)

    val multi2 :(Int, Int) -> Int = {x:Int, y:Int ->
        println("${x} * ${y}")
        x * y
    }

    result = multi2(2, 5)
    println(result)



    val multi3:(Int, Int) -> Int = {x:Int, y:Int -> x * y}  //생략되지 않은 전체 표현

    val multi4 = {x:Int, y:Int -> x * y}    //선언 자료형 생략

    val multi5:(Int,Int) ->Int = {x, y -> x * y}    //람다식 매개변수 자료형의 생략

    val greet: () -> Unit = { println("Hola World")}
    val square: (Int) -> Int = { x -> x * x }


    //람다식의 자료형 생략
    val greet2 = { println("Hello World!")}//추론 가능
    val square2 = {x:Int -> x * x}  //square의 자료형을 생략하려면 x의 자료형을 명시해야함.













}