package chap03.section1


//fun키워드로 함수 선언 시작
    //이름 짓기
        //매개변수 정의하기
                        //반환값의 자료 명시하기
fun sum1(a: Int, b: Int): Int {
    //함수의 본문 완성하기
    var sum = a + b
    //값 반환하기
    return sum
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

//중괄호 안의 코드가 한 줄이면 중괄호와 return 문을 생략할 수 있다.
//이 때 return문을 생략한 대신 대입 연산자(=)를 사용해야 한다.
fun sum3(a: Int, b: Int): Int = a + b


//더할 값이 Int 형이면 반환값도 Int형.
// 이 점을 이용하면 함수를 더 간략하게 만들 수도 있다. 반환값의 자료형도 생략할 수 있다.
fun sum4(a: Int, b: Int) = a + b

fun main() {
    val result1 = sum4(3, 2)
    val result2 = sum4(6, 7)

    println(result1)
    println(result2)
}
