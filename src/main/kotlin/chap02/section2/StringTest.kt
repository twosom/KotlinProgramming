package chap02.section2

fun main() {
    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"
    println("str1 === str2: ${str1 === str2}")

    //Kotlin 은 String Pool을 이용하여 필요한 경우 메모리 공갠을 재사용함
    println("str1 === str3 : ${str1 === str3}")

}