package chap04.section3

fun main() {
    labelBreak2()
}

fun labelBreak() {
    println("labelBreak")
    for (i in 1..5) {
         for (j in 1..5) {
            if(j == 3) continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak2() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if(j == 3)continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}