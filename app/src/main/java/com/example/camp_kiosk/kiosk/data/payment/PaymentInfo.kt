package com.example.camp_kiosk.kiosk.data.payment

import com.example.camp_kiosk.kiosk.data.client.Client
import com.example.camp_kiosk.kiosk.data.edible.Edible
import com.example.camp_kiosk.kiosk.data.edible.EdibleElement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.text.SimpleDateFormat
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

class PaymentInfo(
    private val _client: Client
) {
    private val _cart = mutableListOf<Edible>()
    private var _totalPayment = 0
    private var _totalCalorie = 0

    private val _waitList = mutableListOf<Int>()
    private var _orderId = 0

    // private val _displayScreen = Mutex()

    fun showCart() {
        var printString = ""
        _cart.forEachIndexed { index, stuff ->
            printString += "${index + 1}. ${(stuff as EdibleElement).displayInfo}\n"
        }
        println(printString)
    }

    fun addEdibleToCart(edible: Edible) {
        _cart.add(edible)
        _totalPayment += edible.price
        _totalCalorie += edible.calorie
    }

    fun removeEdibleFromCartAt(index: Int) {
        val temp = _cart.removeAt(index)
        _totalPayment -= temp.price
        _totalCalorie -= temp.calorie
    }

    private fun clearCart() {
        _cart.clear()
        _totalCalorie = 0
        _totalPayment = 0
    }

    fun showTotalPayment() {
        println("총금액은 ${_totalPayment}원 입니다.")
        if(_cart.size != 0) {
            if (_client.budget >= _totalPayment) println("구매 가능합니다.")
            else println("예산 초과입니다.")
        }
    }

    fun pay() {
        val currentTime = System.currentTimeMillis()
        val currentTimeToFormat = SimpleDateFormat("yyyy-MM-dd: HH:mm:ss").format(currentTime)
        if(isPaymentValidByTime(currentTime)) {
            if(_client.budget >= _totalPayment) {
                if(_cart.size != 0) {
                    println("${_totalPayment}를 결재하셨습니다 ($currentTimeToFormat)")
                    clearCart()
                    _waitList.add(++_orderId)
                } else println("구매할 물품이 없습니다.")
            } else println("예산 초과로 구매할 수 없습니다.")
        } else println("00:00 ~ 01:00 에는 결제할 수 없습니다. ($currentTimeToFormat)")
    }

    private fun isPaymentValidByTime(current: Long): Boolean {
        val hour = SimpleDateFormat("HH").format(current).toInt()
        return hour != 0
    }

    fun showInfo() {
        thread(start = true) {
            CoroutineScope(Dispatchers.IO).launch {
                while(true) {
                    val duration = measureTimeMillis {
                        val size = _waitList.size
                        if(size > 0) {
                            println("현재 주문 대기수: $size")
                        }
                    }
                    if(duration < 5000) delay(5000 - duration)
                }
            }
        }
    }
}