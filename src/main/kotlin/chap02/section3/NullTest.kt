package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    //str1 = null // 오류! null을 허용하지 않음
    //Kotlin: Null can not be a value of a non-null type String
    println("str1:$str1")


    //변수에 null을 할당하려면 자료형 뒤에 물음표(?)를 명시해야 함.

    //변수의 null 허용 여부에 따라 String과 String?은 서로 다른 자료형
    //이라는 것을 이해해야 한다.
    var str2: String? = "Hi Swift"

    println("str2:$str2")
    //***Safe Call - null이 할당되어 있을 가능성이 있는 변수를 검사하여
    //안전하게 호출하도록 도와주는 기법

    //Safe Call(?.)를 추가하려면
    //호출할 변수명 뒤에 . 대신에 ?. 을 붙인다.
    println("str2의 길이 ${str2?.length}")

    //***non-null단정 기호(!!.) - 변수에 할당된 값이 null이 아님을
    //단정하는 것. 컴파일러가 null 검사 없이 무시
    str2 = null
    println("str2:$str2")
   // println("str2의 길이 ${str2!!.length}")  //null을 허용하면 length가 실행될
                                            //수 없음.



}