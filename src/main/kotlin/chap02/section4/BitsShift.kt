package chap02.section4

fun main() {
    var x = 8
    var y = 0b0000_1010 //10진수 5
    var z = 0x0F    //16진수 15

    println("x shl 2 -> ${x shl 2}")
    println("x.inv() -> ${x.inv()}")    //inv는 부호 바꾼 다음에 -1을 한것

    println("y shr 4 -> ${y / 4}, ${y shr 4}")
    println("x shl 4 -> ${x * 16}, ${x shl 4}")
    println("z shl r -> ${z * 16}, ${z shl 4}")


    x = 64
    println("x shr 4 -> ${x/4}, ${x shr 2}")
}