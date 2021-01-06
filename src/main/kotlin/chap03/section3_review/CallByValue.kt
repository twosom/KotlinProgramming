package chap03.section3_review

//기본형 변수로 할당된 "값"은 스택에 있고
//다른 함수에 인자로 전달하는 경우에는
//해당 값이 "복사"되어 전달됨.

//참조형 변수로 할당된 객체는 "참조주소"가 스택에 있고
//객체는 힙에 있음.
//참조형 변수로 전달될 때는 "참조형 주소"가 복사되어
//전달됨

//JVM에서 실행되는 Java나 Kotlin 은 함수를 호출할 때 인자의 값만 복사하는
//"값에 의한 호출(Call By Value)"이 일반적.
//C/C++에서 사용하는 포인터 주소 연산이 없기 때문에 주소 자체를 사용해 호출하는
//"참조에 의한 호출(Call  By Reference)"은 자바나 코틀린에서 사용하지 않음.


//**Java 는 객체가 전달될 때 "주소 자체를 전달하는 것이 아닌 값을 복사" 하는데
//이것은 참조에 의한 호출처럼 보이지만 그 값이 주소일 뿐.
//Kotlin은 람다식을 사용하면서 몇 가지 확장된 호출 방법을 사용할 수 있음.
//Kotlin에서 값에 의한 호출은 함수가 또 다른 함수의 인자로 전달될 경우
//람다식 함수는 값으로 처리되어 그 즉시 함수가 수행된 후 값을 전달.


fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}


val lambda: () -> Boolean = {   //람다 표현식이 2줄
    println("lambda function")
    true
}


fun main() {
    println(lambda())

    val result=callByValue(lambda())    //람다식 함수를 호출
    println(result)
}
