package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.BURGER_MENU_DESCRIPTION
import com.example.camp_kiosk.kiosk.BURGER_MENU_NAME
import com.example.camp_kiosk.kiosk.data.edible.Edible
import com.example.camp_kiosk.kiosk.data.payment.PaymentInfo

class BurgerMenu(
    name: String = BURGER_MENU_NAME,
    description: String = BURGER_MENU_DESCRIPTION,
    private val paymentInfo: PaymentInfo
): MenuElement(name, description) {
    override fun handleChildAt(index: Int) {
        try {
            val child = super.children[index]
            paymentInfo.addEdibleToCart(child as Edible)
            println("${child.displayInfo.split("|")[0]}가 장바구니에 추가되었습니다.")
        } catch(e: Exception) { }
    }
}