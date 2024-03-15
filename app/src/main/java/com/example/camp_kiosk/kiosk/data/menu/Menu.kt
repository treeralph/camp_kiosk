package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.data.Element

interface Menu {
    var index: Int
    var parentIndex: Int?
    val children: MutableList<Element>
    val childrenIndex: MutableList<Int>
    fun show()
    fun addChild(element: Element)


    // TODO
    // 각 자식 엘레멘트를 처리하는 함수를 추가해주자.
    // 그리고 컨트롤러에서는 자식이 메뉴인지 아닌지를 분기하여
    // 이 함수에 넣을지 아니면 메뉴 이동을 할지 결정하자.
    // 이렇게 하면 컨트롤러 깔끔해질듯
}