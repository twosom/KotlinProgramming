package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = "안녕"
    //엘비스(Elvis) 연산자(?:) - 변수가 null인지 아닌지 검사하여 null이 아니라면
    //왼쪽의 식을 그대로 실행, null이라면 오른쪽 식을 실행
    println("str1: $str1 length: ${str1?.length ?: -1}")

    """
       즉, str1?.length ?: -1이라는 표현은 다음 코드와 같겠다.
        if(str1 != null){
            str1.length
        } else {
            -1
        }
    """


    var str2: String? = "Hi Swift"
    str2 = null
    println("str2 : $str2, str2의 길이 ${str2?.length ?: "Null입니다~"}")

}