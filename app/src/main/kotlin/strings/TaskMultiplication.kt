package org.example.app.strings

fun multiplication(num: Int) {
    val number: Int = num
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}