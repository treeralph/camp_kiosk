package com.example.camp_kiosk.kiosk

import com.example.camp_kiosk.kiosk.data.menu.BurgerMenu
import com.example.camp_kiosk.kiosk.data.Element
import com.example.camp_kiosk.kiosk.data.edible.beverage.Coke
import com.example.camp_kiosk.kiosk.data.edible.beverage.Sprite
import com.example.camp_kiosk.kiosk.data.edible.beverage.Water
import com.example.camp_kiosk.kiosk.data.edible.burger.BaconBurger
import com.example.camp_kiosk.kiosk.data.edible.burger.Burger
import com.example.camp_kiosk.kiosk.data.edible.burger.CheeseBurger
import com.example.camp_kiosk.kiosk.data.edible.side.FrenchFries
import com.example.camp_kiosk.kiosk.data.edible.side.Nugget
import com.example.camp_kiosk.kiosk.data.edible.side.OnionRing
import com.example.camp_kiosk.kiosk.data.menu.BeverageMenu
import com.example.camp_kiosk.kiosk.data.menu.CartMenu
import com.example.camp_kiosk.kiosk.data.menu.Menu
import com.example.camp_kiosk.kiosk.data.menu.MenuElement
import com.example.camp_kiosk.kiosk.data.menu.PaymentMenu
import com.example.camp_kiosk.kiosk.data.menu.RootMenu
import com.example.camp_kiosk.kiosk.data.menu.SideMenu
import com.example.camp_kiosk.kiosk.data.payment.Pay
import com.example.camp_kiosk.kiosk.data.payment.PaymentInfo
import java.util.LinkedList
import java.util.Queue

class MenuController(private val paymentInfo: PaymentInfo) {
    private val menuList = mutableListOf<Menu>()
    init {
        val rootMenu = RootMenu()

        val burgerMenu = BurgerMenu(paymentInfo = paymentInfo)
        burgerMenu.addChild(Burger())
        burgerMenu.addChild(CheeseBurger())
        burgerMenu.addChild(BaconBurger())

        val sideMenu = SideMenu(paymentInfo = paymentInfo)
        sideMenu.addChild(FrenchFries())
        sideMenu.addChild(Nugget())
        sideMenu.addChild(OnionRing())

        val beverageMenu = BeverageMenu(paymentInfo = paymentInfo)
        beverageMenu.addChild(Coke())
        beverageMenu.addChild(Sprite())
        beverageMenu.addChild(Water())

        val cartMenu = CartMenu(paymentInfo = paymentInfo)

        val paymentMenu = PaymentMenu(paymentInfo = paymentInfo)
        paymentMenu.addChild(Pay())

        rootMenu.addChild(burgerMenu)
        rootMenu.addChild(sideMenu)
        rootMenu.addChild(beverageMenu)
        rootMenu.addChild(cartMenu)
        rootMenu.addChild(paymentMenu)

        treeToList(rootMenu)
    }
    fun operate() {
        paymentInfo.showInfo()
        var menu: Menu? = menuList[0]
        while(menu != null) {
            menu.show()
            readlnOrNull()?.let { userInput ->
                try {
                    val userInputInt = userInput.toInt()
                    if (userInputInt == 0) menu = menu!!.parentIndex?.let { menuList[it] }
                    val target: Element? = try {
                        menu!!.children[userInputInt - 1]
                    } catch(e: Exception) { null }
                    if(target is Menu) menu = target
                    else (menu as MenuElement).handleChildAt(userInputInt - 1)
                } catch(e: Exception) {
                    print("잘못된 입력입니다.\n\n")
                }
            }
        }
        println("프로그램을 종료합니다.")
    }

    /**
     * Only Tree structure Not Graph
     * */
    private fun treeToList(root: Menu) {
        val queue: Queue<Menu> = LinkedList()
        queue.add(root)
        while(queue.isNotEmpty()) {
            queue.poll()?.let { current ->
                val index = menuList.size
                current.index = index
                current.parentIndex?.let { parentIndex -> // 부모 메뉴가 있으면 부모에 관계 추가
                    if(parentIndex != -1) {
                        menuList[parentIndex].let { parent ->
                            parent.childrenIndex[parent.children.indexOf(current as Element)] =
                                index
                        }
                    }
                }
                menuList.add(current)
                current.children.forEach { child ->
                    try {
                        val tempChild = child as Menu
                        tempChild.parentIndex = index
                        queue.add(tempChild)
                    } catch(e: Exception) { } // pass Element which isn't Menu
                }
            }
        }
    }
}
