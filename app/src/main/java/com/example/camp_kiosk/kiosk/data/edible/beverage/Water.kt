package com.example.camp_kiosk.kiosk.data.edible.beverage

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
import com.example.camp_kiosk.kiosk.SPRITE_CALORIE
import com.example.camp_kiosk.kiosk.SPRITE_PRICE
import com.example.camp_kiosk.kiosk.WATER_CALORIE
import com.example.camp_kiosk.kiosk.WATER_DESCRIPTION
import com.example.camp_kiosk.kiosk.WATER_NAME
import com.example.camp_kiosk.kiosk.WATER_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class Water(
    private val name: String = WATER_NAME,
    private val description: String = WATER_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = WATER_CALORIE
        super.price = WATER_PRICE
        super.displayUpdate()
    }
}