package chap06.section3

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

class C {
    private fun foo() = object {
        val x: String = "x"
    }

    //public function -> 자료형은 Any형이 됨.
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
        val x2 = publicFoo()
    }
}

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount += 1
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount += 1
        }
    })
}