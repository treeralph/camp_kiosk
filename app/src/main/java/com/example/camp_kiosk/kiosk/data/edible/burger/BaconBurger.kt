package com.example.camp_kiosk.kiosk.data.edible.burger

import com.example.camp_kiosk.kiosk.BACON_BURGER_CALORIE
import com.example.camp_kiosk.kiosk.BACON_BURGER_DESCRIPTION
import com.example.camp_kiosk.kiosk.BACON_BURGER_NAME
import com.example.camp_kiosk.kiosk.BACON_BURGER_PRICE
import com.example.camp_kiosk.kiosk.ONION_RING_CALORIE
import com.example.camp_kiosk.kiosk.ONION_RING_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class BaconBurger(
    private val name: String = BACON_BURGER_NAME,
    private val description: String = BACON_BURGER_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = BACON_BURGER_CALORIE
        super.price = BACON_BURGER_PRICE
        super.displayUpdate()
    }
}