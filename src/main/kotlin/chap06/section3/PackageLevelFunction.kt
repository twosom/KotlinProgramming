@file:JvmName("PKLevel")
package chap06.section3

fun packageLevelFunc() {
    println("Package-Level Function")
}

fun myName() {
    println("my name is somang")
}


fun main() {
    packageLevelFunc()
}