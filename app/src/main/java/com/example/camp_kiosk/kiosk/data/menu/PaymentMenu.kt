package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.PAYMENT_MENU_DESCRIPTION
import com.example.camp_kiosk.kiosk.PAYMENT_MENU_NAME
import com.example.camp_kiosk.kiosk.data.payment.PaymentInfo

class PaymentMenu (
    name: String = PAYMENT_MENU_NAME,
    description: String = PAYMENT_MENU_DESCRIPTION,
    private val paymentInfo: PaymentInfo,
): MenuElement(name, description) {
    override fun show() {
        println("[$displayInfo]")
        var printString = ""
        paymentInfo.showCart()
        paymentInfo.showTotalPayment()
        children.forEachIndexed { index, child ->
            printString += "${index+1}. ${(child).displayInfo}\n"
        }
        printString += "0. BACK\n: "
        print(printString)
    }
    override fun handleChildAt(index: Int) {
        try {
            val child = super.children[index]
            paymentInfo.pay()
        } catch(e: Exception) {}
    }
}
