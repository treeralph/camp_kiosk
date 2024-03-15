package com.example.camp_kiosk.kiosk.data.edible.beverage

import com.example.camp_kiosk.kiosk.CHEESE_BURGER_CALORIE
import com.example.camp_kiosk.kiosk.CHEESE_BURGER_PRICE
import com.example.camp_kiosk.kiosk.COKE_CALORIE
import com.example.camp_kiosk.kiosk.COKE_DESCRIPTION
import com.example.camp_kiosk.kiosk.COKE_NAME
import com.example.camp_kiosk.kiosk.COKE_PRICE
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_CALORIE
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_DESCRIPTION
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_NAME
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_PRICE
import com.example.camp_kiosk.kiosk.ONION_RING_CALORIE
import com.example.camp_kiosk.kiosk.ONION_RING_DESCRIPTION
import com.example.camp_kiosk.kiosk.ONION_RING_NAME
import com.example.camp_kiosk.kiosk.ONION_RING_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class Coke(
    private val name: String = COKE_NAME,
    private val description: String = COKE_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = COKE_CALORIE
        super.price = COKE_PRICE
        super.displayUpdate()
    }
}