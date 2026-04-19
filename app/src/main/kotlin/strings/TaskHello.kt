package org.example.app.strings

import java.time.LocalTime
import java.time.format.DateTimeFormatter


fun hello() {

    val userName = "Constance"

    var greeting: String

    greeting = "Good afternoon, $userName!"
    println(greeting)
    greeting = "Good evening, $userName!"
    println(greeting)


    /* val timeNow = LocalTime.now()
    val timeNowHour = timeNow.hour

    val greeting = when (timeNowHour) {
        in 6..12 -> "Good Morning, $userName!"
        in 13..18 -> "Good Afternoon, $userName!"
        in 19..24 -> "Good Evening, $userName!"
        in 0..5 -> "Good Night, $userName!"
        else -> "Hello, $userName!"
    }
    println(greeting)
    */
}