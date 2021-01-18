package chap06.section3


//object 키워드를 사용한 방식
object OCustomer {
    var name = "Kilidong"
    fun greeting() = println("Hello World!")
    val HOBBY: Hobby by lazy {
        println("lazy 발동")
        Hobby("Basketball")
    }
    init {
        println("Init!")
    }
}

//컴패니언 객체를 사용한 방식
class CCustomer {
    companion object {
        //const는 컴파일 시간의 상수.
        //컴파일시간의 상수란 val과 다르게
        //이미 값이 할당되는 것으로, 자바에서 접근하기 위해 필요.
        //val은 실행 시간에 할당하지만, const는 Int형, Double형과 같이
        //기본형으로 사용할 자료형과 String 형에만 적용할 수 있다.
        const val HELLO = "hello"   //상수 표현
        var name = "Joosol"


        /*val HOBBY: Hobby by lazy {
            println("CCustomer lazy")
            Hobby("Footbal")
        }*/
        @JvmField   //특정 자료형을 사용하기 위한 애노테이션
        val HOBBY = Hobby("Football")
        @JvmStatic
        fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String){
    override fun toString(): String {
        return "name = $name"
    }
}


fun main() {
    OCustomer.greeting()    //객체의 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()    //companion object 안에서 정의 되어 있으므로 static 처럼 사용 가능
    println("name = ${CCustomer.name}")
    println(CCustomer.HOBBY.name)



}