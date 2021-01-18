package chap04.section2

fun main() {
    print("Enter n : ")
    var n = readLine()!!.toInt()

    for (line in 1..n) {
        for (space in 1..n - line) {
            print(" ")
        }
        for (star in 1..line * 2 - 1) {
            print("*")
        }
        println()
    }
}