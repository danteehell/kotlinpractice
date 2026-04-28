package org.example.app.` comparison`

fun isEcology() {
    val sunWeather = true
    val tent = true
    val humidity = 20
    val season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunWeather && tent && humidity == 20 && season != "winter"}")
}