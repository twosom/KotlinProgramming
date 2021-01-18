package chap06.section1

class User(_id:Int, _name:String, _age:Int){
    val id = _id    //변경 불가능
    var name: String = _name    //변경 가능
    var age: Int = _age //변경 가능
}


/*
위와 같은 표현은 다음과 같이 간소화 할 수 있다.
class User(val id:Int, var name:String, var age:Int)
여기서 id는 val로 선언된 불변 값 프로퍼티,
name과 age는 var로 서넌되어 나중에 변경 가능한 가변형 프로퍼티라는 점을 눈여겨봐야 함.
 */

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name    //게터에 의한 값 획득
    user.age = 41   //세터에 의한 값 지정
    println("name: $name, ${user.age}")


}