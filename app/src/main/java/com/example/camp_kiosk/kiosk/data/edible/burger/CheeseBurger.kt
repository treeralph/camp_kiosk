package com.example.camp_kiosk.kiosk.data.edible.burger

import com.example.camp_kiosk.kiosk.BURGER_CALORIE
import com.example.camp_kiosk.kiosk.BURGER_PRICE
import com.example.camp_kiosk.kiosk.CHEESE_BURGER_CALORIE
import com.example.camp_kiosk.kiosk.CHEESE_BURGER_DESCRIPTION
import com.example.camp_kiosk.kiosk.CHEESE_BURGER_NAME
import com.example.camp_kiosk.kiosk.CHEESE_BURGER_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class CheeseBurger(
    private val name: String = CHEESE_BURGER_NAME,
    private val description: String = CHEESE_BURGER_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = CHEESE_BURGER_CALORIE
        super.price = CHEESE_BURGER_PRICE
        super.displayUpdate()
    }
}