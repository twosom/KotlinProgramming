package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false //초기값 확인 용도

    //by lazy를 사용해서 Person객체를 지연 초기화 하고 있음.
    val person: Person by lazy {  //lazy를 사용한 person객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim", 23) //이 부분이 Lazy객체로 반환됨.
    }
    //lazy만 사용해서 위임 변수를 받아서 지연 초기화에 사용하고 있음.
    val personDelegate = lazy {
        Person("Hong", 40)  //위임 변수를 사용한 초기화
    }
    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")
    //이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")


}
