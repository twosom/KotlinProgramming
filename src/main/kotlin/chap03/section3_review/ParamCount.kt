package chap03.section3_review

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun main() {
            //매개변수가 한 개인 경우 소괄호 생략 가능
    oneParam { String -> String }
    oneParam({a->"Hello World! $a"})
    println()
    oneParam(out = { a -> "${a}" })
    oneParam{a ->"Hello World ${a}"}
}