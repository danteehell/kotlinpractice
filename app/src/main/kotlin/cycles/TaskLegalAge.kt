package org.example.app.cycles

const val currentYear: Int = 2026
const val AGE_OF_MAJORITY: Int = 18

fun checkAge(year: Int): Unit {
    val message = if (currentYear - year >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Ничё не показывать"

    println(message)
}

