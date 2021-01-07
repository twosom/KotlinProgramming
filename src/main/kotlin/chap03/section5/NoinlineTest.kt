package chap03.section5


fun main() {
                        //fun out(x: Int) : Unit{
                            // println("First call : $x")
                        //}
    shortFunc1(3){x:Int -> println("First call : $x")}


}
                                //fun noinline out(x: Int) : Unit{ println("First call : $x")}
inline fun shortFunc1(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
