package com.example.camp_kiosk.kiosk.data.edible.side

import com.example.camp_kiosk.kiosk.FRENCH_FRIES_CALORIE
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_DESCRIPTION
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_NAME
import com.example.camp_kiosk.kiosk.FRENCH_FRIES_PRICE
import com.example.camp_kiosk.kiosk.NUGGET_CALORIE
import com.example.camp_kiosk.kiosk.NUGGET_DESCRIPTION
import com.example.camp_kiosk.kiosk.NUGGET_NAME
import com.example.camp_kiosk.kiosk.NUGGET_PRICE
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement

class Nugget(
    private val name: String = NUGGET_NAME,
    private val description: String = NUGGET_DESCRIPTION,
): EdibleElement(name, description) {
    init {
        super.calorie = NUGGET_CALORIE
        super.price = NUGGET_PRICE
        super.displayUpdate()
    }
}