package chap05.section4

open class A{
    open fun f() = println("A class f()")
    fun a() = println("A class a()")
}


interface B {
    fun f() = println("B interface f()")    //인터페이스는 기본으로 open이다.
    fun b() = println("B interface b()")
}


class C : A(), B {  //쉼표(,)를 사용해 클래스와 인터페이스를 지정
    //컴파일 되려면 f가 오버라이딩 되야함.
    override fun f() = println("C Class f()")

    fun test() {
        f() //현재 클래스의 f() - 오버라이딩.
        b() //인터페이스 B의 b()
        super<A>.f()    //A클래스의 f()
        super<B>.f()    //B인터페이스의 f()
    }

}

fun main() {
    val c = C()
    c.test()
}