package chap03.section3_review

import java.util.concurrent.locks.ReentrantLock

fun twoLambda(first: (String, String) -> String,
              second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
    //매개변수가 1개인 경우에는 화살표 표기를 생략하고 $it으로 대체할 수 있겟다.
}

fun main() {
   twoLambda(first = {a:String, b:String -> "a is $a b is $b"})
   {"the default value is $it"}

    twoLambda({a, b -> "1. $a 2.$b"}){"1.$it"}

    twoLambda({_, b -> "$b"}){"$it"}
}