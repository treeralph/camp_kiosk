package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.data.Element

abstract class MenuElement(
    private val name: String,
    private val description: String,
): Menu, Element {
    override val displayInfo: String = "$name | $description"
    override var index: Int = -1
    override var parentIndex: Int? = -1
    override val children: MutableList<Element> = mutableListOf()
    override val childrenIndex: MutableList<Int> = mutableListOf()
    override fun show() {
        var printString = "[$displayInfo]\n"
        children.forEachIndexed { index, child ->
            printString += "${index+1}. ${(child).displayInfo}\n"
        }
        printString += "0. BACK\n: "
        print(printString)
    }
    override fun addChild(element: Element) {
        children.add(element)
        childrenIndex.add(-1)
    }
    abstract fun handleChildAt(index: Int)
}