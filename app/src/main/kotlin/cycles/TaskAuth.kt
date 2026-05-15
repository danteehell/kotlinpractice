package org.example.app.cycles


fun auth(): String {
    val task = "2 + 2"
    val answer = 4

    println("Решите пример $task:")

    val decision = readln().toIntOrNull()

    return when (decision) {
        answer -> "Добро пожаловать!"
        else -> "Доступ запрещен."
    }

}
