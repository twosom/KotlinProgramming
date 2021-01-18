package chap04.section2

fun main() {
    print("Enter the number:")
    var number = readLine()!!.toInt()
    var factorial: Long = 1
    var i = 1

    while (i <= number) {
        factorial*=i
        i ++
    }
    println("Factorial : $factorial")


    var add = { x: Int, y: Int -> x + y }
    println(add(1, 2))
}