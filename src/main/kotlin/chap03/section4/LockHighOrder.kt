package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable = 1    //보호가 필요한 공유 자원

fun test(body: (Unit) -> Unit): Unit {
    println("for Test")
}

fun main() {
    //ReentrantLock 인스턴스 생성
    val reLock = ReentrantLock()
    lock(reLock = reLock,::criticalFunc)
    lock(reLock){ criticalFunc()}
    lock(reLock) {
        println("lock 메소드 실행")
        sharable += 1
    }
    println(sharable)
    println("_____")
    println(add(2, 3))

}

fun criticalFunc() {
    //공유 자원 접근 코드 사용
    sharable += 1
    println("add함수 : ${add2(3,5)}")
    println("add3함수 : ${add3(10, 5)}")


}

val add ={x:Int, y:Int -> x+y}

val add2:(Int, Int) -> Int = {x, y -> x + y}

val add3:(Int, Int) -> Int = fun(x, y) = x + y



fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}

