package com.example.camp_kiosk.kiosk.data.edible.side

import com.example.camp_kiosk.kiosk.FRENCH_FRIES_CALORIE
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_DESCRIPTION
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_NAME
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_PRICE
import com.example.camp_kiosk.kiosk.NUGGET_CALORIE
import com.example.camp_kiosk.kiosk.NUGGET_PRICE
import com.example.camp_kiosk.kiosk.ONION_RING_CALORIE
import com.example.camp_kiosk.kiosk.ONION_RING_DESCRIPTION
import com.example.camp_kiosk.kiosk.ONION_RING_NAME
import com.example.camp_kiosk.kiosk.ONION_RING_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class OnionRing(
    private val name: String = ONION_RING_NAME,
    private val description: String = ONION_RING_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = ONION_RING_CALORIE
        super.price = ONION_RING_PRICE
        super.displayUpdate()
    }
}