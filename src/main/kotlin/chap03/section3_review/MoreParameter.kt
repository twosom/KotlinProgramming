package chap03.section3_review

//매개변수가 2개 있는 람다식의 moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun main() {
    moreParam(out = { x: String, y: String -> x + ", " + y })

    //만일 특정 람다식의 매개변수를 사용하고 싶지 않을 때는 이름 대신
    //언더스코어(_)로 대체할 수 있음.
    moreParam(out = {_, y:String -> "Hi! $y"})
    moreParam{_,b:String -> "$b"}


    withArgs("Arg1", "Arg2", out = {a:String, b:String ->
        println("a=$a b=$b")
        "Hello World $a, $b"
    })

    println()

    //만약 일반 함수의 마지막 매개변수가 람다식 함수라면
    //함수의 소괄호 바깥으로 마지막 인자인 람다식을 "빼낼 수 있다"
    //단 이런 형태로 함수를 간략화하려면 "람다식 매개변수가
    //마지막 인자 위치에 있어야 한다는 규칙이 있다."
    withArgs("Args1", "Args2"){a, b ->
        println("a = $a b = $b")
        "Hello World $a $b"
    }


}

//withArgs() 함수는 일반 매개변수 2개를 포함, 람다식을 마짐가 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}


