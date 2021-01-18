package chap06.section2

data class Person2(var name: String, var age: Int)


lateinit var person1: Person2
//lateinit은 var로만 선언 가능하다.
//lazy를 사용한 지연 초기화
/*lateinit을 통해서 프로퍼티나 객체를 선언할 때 val는 허용하지 않고 var를 선언해야 하는데
var로 선언하면 객체나 프로퍼티의 경우 언제든 값이 변경될 수 있는 단점이있다.
그렇다면 읽기 전용의 val로 선언한 객체나 프로퍼티를 나중에 초기화하려면 어떻게 해야할까.
바로 lazy를 적용하면 된다. lazy는 다음 특징이 있다.
호출 시점에 by lazy{...} 정의에 읳 ㅐ블록부분의 초기화를 진행.
불변의 변수 선언인 val에서만 사용 가능(읽기 전용)
val이므로 값을 다시 변경할 수 없음.
*/



fun main() {
    person1 = Person2("Kildong", 30)
    print(person1.name + " is " + person1.age.toString())

}