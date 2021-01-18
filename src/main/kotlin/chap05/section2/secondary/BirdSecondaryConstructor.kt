package chap05.section2.secondary

class Bird {
    //프로퍼티 선언만
    var name: String    //원래 프로퍼티는 정의하고 초기화까지 해야 한다. 하지만
    var wing: Int       //우리는 생성자로 초기화를 하겠다,.
    var beak: String
    var color: String

    //부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 저장
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    //두번째 부 생성자
    constructor(name: String, beak: String) {
        this.name = name
        wing = 2
        this.beak = beak
        color = "grey498-2"
    }



    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}