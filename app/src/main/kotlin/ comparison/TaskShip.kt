package org.example.app.` comparison`

fun isCan() {
    val isDamage: Boolean = true
    val crewCount: Int = 60
    val boxCount: Int = 60
    val isFavorable: Boolean = false
    val canDepartLongVoyage = (!isDamage && crewCount in 55..70 && boxCount > 50) ||
            (isDamage && crewCount == 70 && isFavorable &&  boxCount >= 50)

    if (canDepartLongVoyage) {
        println("Корабль готов к отплытию")
    }
    else {
        println("Корабль не готов к отплытию")
    }
}
