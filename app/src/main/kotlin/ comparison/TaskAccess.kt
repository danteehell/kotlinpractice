package org.example.app.` comparison`

const val TABLES_COUNT = 13
fun TaskAccess() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println( "[Доступность столиков на сегодня: ${TABLES_COUNT > reservedToday}], \n[Доступность столиков на завтра: ${TABLES_COUNT > reservedTomorrow}].")
}