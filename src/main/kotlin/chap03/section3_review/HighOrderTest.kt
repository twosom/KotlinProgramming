package chap03.section3_review

fun main() {
    var result: Int
    //화살표(->)기호를 기준으로 왼쪽에는 람다식의 매개변수
                        //오른쪽에는 함수의 내용과 반환값
    //만약 함수의 표현식이 2줄 이상이라면 "마지막 표현식"이 반환값이 됨.
    val multi={x:Int, y:Int -> x * y}
    //일반 변수에 람다식 할당
    //람다식이 변수에 할당되어 변수 이름이 multi() 와 같은 형태로 사용 가능

    result = multi(10, 20)
    println("result = $result")
    println("multi = $multi")
    //multi = (kotlin.Int, kotlin.Int) -> kotlin.Int

    val multi12:(Int, Int) -> Int = {x:Int, y:Int ->
        println("$x 곱하기 $y 의 값은 ${x * y}입니다.")
        x * y
    }


    val result2 = multi12(3,5)
    println(result2)

    //람다식은 매개변수에 자료형이 저장되어 있다면 변수의 자료형은 생략 가능하다
                //매개변수의 자료형 지정  = {람다식 표현}
    val multi1: (Int, Int) -> Int={x:Int,y:Int -> x * y}

            //자료형의 선언 생략 후에 바로 람다표현식 대입
            //컴파일러가 타입을 추론할 수 있을 때는 생략 가능
    val multi2 = { x: Int, y: Int -> x * y }

                                    //람다식의 매개변수 자료형 생략
                //선언부에 매개변수 자료형을 적었으므로 표현부에는
                            //컴파일러가 유추가능
    val multi3: (Int, Int) -> Int = { x, y -> x * y }

    //반환 자료형이 아예 없거나 매개변수가 하나만 있을 경우
        //타입선어부에 괄호 빈칸 -> Unit은 Java의 Void에 대응
                                //매개변수를 표현할 "필요"가 없으므로
                            //화살표 앞쪽과 화살표 자체 생략.
    val greet: () -> Unit = { println("Hello World!") }
    //매개변수가 한개이면 그냥 그거 적어주면 된다.
    val square: (Int) -> Int = { x -> x * x }
    val square2 = { x: Int-> x * x }


    val result3 = square2(12)
    println(result3)


    val insideLambda: () -> Unit = { println("insideLambda") }

    val outsideLambda: () -> Unit = {
        insideLambda()
        println("outsideLambda")
    }

    outsideLambda()




    //람다식 안에 람다식을 넣으면 자료형을 어떻게 지정해야 하는가.
   // val nestedLambda: () -> () -> Unit = { { println("nested") } }
    val originLambda:()->Unit = { println("nested") }
    val nestedLambda:()->Unit={ originLambda() }
    nestedLambda()

    //잘 사용하는 표현은 아니지만 이런 식으로도 람다식에
    //람다식을 넣어 사용할 수 있다는 것도 알아두자.

}

