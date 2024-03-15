package com.example.camp_kiosk.kiosk

import com.example.camp_kiosk.kiosk.data.client.Client
import com.example.camp_kiosk.kiosk.data.payment.PaymentInfo
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class Main {
}

fun main() {
    val client = Client(name = "Lee", budget = 21000)
    val paymentInfo = PaymentInfo(client)
    val controller = MenuController(paymentInfo = paymentInfo)
    controller.operate()
}