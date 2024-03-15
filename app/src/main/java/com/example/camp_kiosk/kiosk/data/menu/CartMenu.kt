package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.CART_MENU_DESCRIPTION
import com.example.camp_kiosk.kiosk.CART_MENU_NAME
import com.example.camp_kiosk.kiosk.data.edible.Edible
import com.example.camp_kiosk.kiosk.data.payment.PaymentInfo

class CartMenu (
    name: String = CART_MENU_NAME,
    description: String = CART_MENU_DESCRIPTION,
    private val paymentInfo: PaymentInfo,
): MenuElement(name, description) {
    override fun show() {
        println("[$displayInfo]")
        var printString = ""
        paymentInfo.showCart()
        printString += "0. BACK\n: "
        print(printString)
    }
    override fun handleChildAt(index: Int) {
        paymentInfo.removeEdibleFromCartAt(index)
    }
}