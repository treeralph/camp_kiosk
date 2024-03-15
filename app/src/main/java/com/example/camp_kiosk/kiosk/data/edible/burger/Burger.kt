package com.example.camp_kiosk.kiosk.data.edible.burger

import com.example.camp_kiosk.kiosk.BACON_BURGER_CALORIE
import com.example.camp_kiosk.kiosk.BACON_BURGER_PRICE
import com.example.camp_kiosk.kiosk.BURGER_CALORIE
import com.example.camp_kiosk.kiosk.BURGER_DESCRIPTION
import com.example.camp_kiosk.kiosk.BURGER_NAME
import com.example.camp_kiosk.kiosk.BURGER_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class Burger(
    private val name: String = BURGER_NAME,
    private val description: String = BURGER_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = BURGER_CALORIE
        super.price = BURGER_PRICE
        super.displayUpdate()
    }
}