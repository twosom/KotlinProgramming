package chap06.section2

class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"
    }

    fun flow() {
        println("not initialized")
        println("Subject one: $subject")    //최초 초기화 시점
        println("Subject two: $subject")    //이미 초기화된 값 사용
    }

}

/*
    by lazy : val에서만, lazyinit : var에서만
    lazyinit에 val을 넣으면 에러메세지 뜸 :
            lateinit' modifier is allowed only on mutable properties
    lateinit : var에서만    여기서 핵심은 프로퍼티에 "최초로 접근한 시점"에 해당 프로퍼티가 초기화 된다는 것.
    그 이후에는 해당 프로퍼티의 초기화 된 내용을 재사용.
*/

fun main() {
    val test = LazyTest()
    test.flow()
}