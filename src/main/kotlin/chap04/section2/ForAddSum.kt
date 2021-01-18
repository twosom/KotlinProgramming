package chap04.section2

fun main() {

    var result = 0
    for (i in 1..100 step 2) {
        result += i
    }
    println("Odd total : $result")



    for (i in 0..99 step 2) {
        result += i
    }
    println("Even total : $result")


}