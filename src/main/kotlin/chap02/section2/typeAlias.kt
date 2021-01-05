package chap02.section2

fun main() {

    val user: Username = "Kildong"  //이제부터 Username은 String과 같은 표현
    val choonsik: Choonsik = 180
    println(user)
    println(choonsik)


}
//typealias는 Top Level에서 정의 해야 하는 듯 하다.
typealias Username = String //String을 Username이라는 별명으로 대체
typealias Choonsik = Int    //이제부터 네 이름은 춘식이여

