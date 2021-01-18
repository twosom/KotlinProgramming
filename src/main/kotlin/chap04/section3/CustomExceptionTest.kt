package chap04.section3

class InvalidNameException(name: String) : Exception(name)


fun main() {
    var name = "Kildong123" //숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e: InvalidNameException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }


    //when 문과 범위 지정자를 사용하여 10~20사이의 값이 아닌 경우 본문 블록을 실행하는 코드 작성
    var i = 30

    when (i) {
        !in 1..20 -> {
            println("hi")
        }
    }


}


fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}


fun oneParam(str: String, out: (String) -> String) {
    out(str)
}