package chap02.section3

fun main() {
    var a: Byte = 1
    println(a)
    println("Byte -> Long")
    var b: Long = a.toLong()
    println(b)
    println("Long -> Short")
    var c: Short = b.toShort()
    println(c)
    println("Short -> Int")
    var d: Int = c.toInt()
    println(d)
    println("Int -> Float")
    var e: Float = d.toFloat()
    println(e)
    println("Float -> Double")
    var f: Double = e.toDouble()
    println(f)
    println("Double -> Char")
    var g: Char = f.toChar()
    println(g)
    a = g.toByte()
    println(a)




    println("END")

}