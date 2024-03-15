package com.example.camp_kiosk.kiosk.data.menu

import com.example.camp_kiosk.kiosk.ROOT_MENU_DESCRIPTION
import com.example.camp_kiosk.kiosk.ROOT_MENU_NAME
import com.example.camp_kiosk.kiosk.data.edible.Edible

class RootMenu(
    name: String = ROOT_MENU_NAME,
    description: String = ROOT_MENU_DESCRIPTION
): MenuElement(name, description) {
    override var parentIndex: Int? = null
    override fun handleChildAt(index: Int) {}
}
