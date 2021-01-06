package chap03.section3_review


//callByName()함수가 callByValue() 함수와 다른 점은
//매개변수b가 람다식 자료형으로 선언되었다는 것.
//따라서 매개변수로 "람다식 이름"을 넣어야 함.
//람다식 자체가 매개변수b에 복사되서 사용되기 전까지는
//람다식이 실행되지 않음. -> 람다식의 이름이 매개변수로 전달된 시점이 아닌
//callByName()함수 블럭에 사용되는 b()에 의해 호출.
fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}


fun main() {
    val result = callByName(otherLambda)    //람다식 이름으로 호출
    println(result)


    //sum1()함수는 람다식이 아니므로 원래는 호출할 ㅅ ㅜ없다.
    //그런데 sum1()과 funcParam()의 매개변수 c 의 선어부 구조를 보면
    //"인자 수와 자료형의 개수가 동일" 하다! 이 때는 콜론(::)기호를
    //함수 이름 앞에 사용해 소괄호와 인자를 생략하고 사용할 수 있따.!
    val result1 =  funcParam(3,2,::sum1)
    println(result1)


}


fun sum1(x: Int, y: Int) = x + y
fun funcParam(a:Int, y:Int, c:(Int, Int) -> Int):Int{
    return c(a,y)
}