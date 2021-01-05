package chap02.section2

fun main() {
    var a = 1;
    val str1 = "a = $a"

    //표현식에 의해 a에 2를 더한 값인 3이 됨,
    val str2 = "a = ${a + 2}"
                //이스케이프 문자를 사용해서 문자열 안에서 큰따옴표를 구현하고 있다.
    println("str1: \"$str1\", str2: \"$str2\"")

    //문자열 안에 ${' '}를 이용해서 큰 따옴표나 $기호를 표현할 수 있음.
    val special2 = " ${'"'}${'$'}9.99${'"'}    "
    println(special2)

}