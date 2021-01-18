package chap06.section2

class LazyTest {
    init{
        println("init block")
    }

    //결국 String 객체.
    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"    //lazy반환값.
    }

    fun flow() {
        println("not nitialized")
        println("subject one : $subject")   //최초 초기화 지점.
        println("subject two : $subject")   //이미 초기화 된 값 사용.
    }
}

fun main() {
    val test = LazyTest()   //여기서 아직 subject는 초기화 되지 않음.
    test.flow()
}
