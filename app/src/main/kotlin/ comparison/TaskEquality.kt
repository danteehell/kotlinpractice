package org.example.app.` comparison`

fun equality() {
    val weight = 42
    val volume = 120

    println("Груз с весом ${weight} кг и объемом ${volume} л соответствует категории 'Average:' ${35 < weight && weight <= 100 && volume < 100}")
}