package chap03.section3_review


fun plus(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun parameterFunction(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a,b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}


fun main() {
    val res1 = parameterFunction(3, 2, c = { x: Int, y: Int -> x + y })
    println(res1)

    val res2 = parameterFunction(5, 20){x, y -> x * y}
    println(res2)

    val res3 = parameterFunction(3, 20, ::plus)
    println(res3)

    val res4 = hello(body = {x:String, y:String -> "$x somang here is our $y"})
    res4

    val name: String = "Somang"


    Param_ONE(out = {x:String -> "$x $name"})

}

fun Param_ONE(out: (String) -> String) {
    println(out("OneParam"))
}
