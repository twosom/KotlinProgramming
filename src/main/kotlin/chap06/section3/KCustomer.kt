package chap06.section3

class KCustomer {
    companion object {
        //const는 컴파일 시간의 상수.
        //컴파일 시간의 상수란 val과 다르게
        //이미 값이 할당되는 것으로, 자바에서 접근하기 위해 필요.
        //val은 실행 시간에 할당하지만, const는 Int형, Double형과 같이
        //기본형으로 사용할 자료형과 String 형에만 적용할 수 있다.
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic
        fun login() = println("Login...")//애노테이션 표기 사용.
        fun studyKotlin() {
            println("Kotlin은 너무 어렵다..")
        }

        @JvmField
        val name: String = "Somang"

        @JvmField   //특정 자료형을 사용하기 위한 애노테이션
        val JOB = Kjob()
        private val password: String = "somangsomangJjang123"

    }
}


class Kjob {
    var title: String = "Programmger"
}