package chap06.section2.bylazyobj

class Person(val name: String, val age: Int){
    override fun toString(): String {
        return "name : ${name}, age : ${age}"
    }
}


fun main() {
    var isPersonInstantiated: Boolean = false    //초기화 확인 용도

    val person :Person by lazy {    //lazy를 사용한 person객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim", 23)   //이 부분이 Lazy 객체로 반환된다.
    }
    //by lazy는 객체의 위임.
    //lazy는 변수에 위임된 Lazy객체 자체. 해당 객체에 접근하고자 하려면 value를 한 단계 더 거쳐
    //객체의 멤버인 value.name과 같은 형태로 접근해야 함.
    val personDelegate = lazy(mode = LazyThreadSafetyMode.NONE, initializer = {
        Person("Hong", 40)
    })

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")//이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")
    println(personDelegate.value)
    if (personDelegate is Lazy) {
        println("is lazy")
    }



}
