package chap04.section2

fun main() {
    var sum = 0

    for (x in 1..10) sum += x
    println(sum)

    for (i in 5 downTo 1) println(i)
    println()
    for(i in 1..5 step 2) println(i)
    println()
    for (i in 5 downTo 1 step 2) println(i)


}