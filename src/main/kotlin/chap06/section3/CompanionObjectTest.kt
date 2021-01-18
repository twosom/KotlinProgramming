package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working... ")
        }

        fun study() {
            println("$language study is so hard")
        }
    }
}

fun main() {
    println(Person.language)    //인스턴스를 사용하지 않고 기본값 사용.
    Person.study()
    Person.language = "English" //기본값 변경 가능
    println(Person.language)
    Person.work()   //메서드 실행
    Person.study()

}