package com.example.camp_kiosk.kiosk.data.payment

import com.example.camp_kiosk.kiosk.BACON_BURGER_DESCRIPTION
import com.example.camp_kiosk.kiosk.BACON_BURGER_NAME
import com.example.camp_kiosk.kiosk.PAY_DESCRIPTION
import com.example.camp_kiosk.kiosk.PAY_NAME
import com.example.camp_kiosk.kiosk.data.Element

class Pay(
    private val name: String = PAY_NAME,
    private val description: String = PAY_DESCRIPTION,
): Element {
    override val displayInfo: String = "$description"
}