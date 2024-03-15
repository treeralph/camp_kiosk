package com.example.camp_kiosk.kiosk.data.edible

import com.example.camp_kiosk.kiosk.data.Element

abstract class EdibleElement(
    private val name: String,
    private val description: String,
): Element, Edible {
    override var calorie: Int = 0
    override var price: Int = 0
    override var displayInfo: String = "$name | $price | $description | $calorie"
    fun displayUpdate() {
        displayInfo = "$name | $price | $description | $calorie"
    }
}