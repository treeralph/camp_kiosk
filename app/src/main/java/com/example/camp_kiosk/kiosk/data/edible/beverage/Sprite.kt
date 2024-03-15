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
import com.example.camp_kiosk.kiosk.SPRITE_DESCRIPTION
import com.example.camp_kiosk.kiosk.SPRITE_NAME
import com.example.camp_kiosk.kiosk.SPRITE_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class Sprite(
    private val name: String = SPRITE_NAME,
    private val description: String = SPRITE_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = SPRITE_CALORIE
        super.price = SPRITE_PRICE
        super.displayUpdate()
    }
}