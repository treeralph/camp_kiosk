package com.example.camp_kiosk.kiosk.data.edible.side

import com.example.camp_kiosk.kiosk.FRENCH_FRIES_CALORIE
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_DESCRIPTION
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_NAME
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class FrenchFries(
    private val name: String = FRENCH_FRIES_NAME,
    private val description: String = FRENCH_FRIES_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = FRENCH_FRIES_CALORIE
        super.price = FRENCH_FRIES_PRICE
        super.displayUpdate()
    }
}