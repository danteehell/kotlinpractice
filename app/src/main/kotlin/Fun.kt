package org.example.app

fun sum(a: Int, b: Int): Int = a + b
fun sumThree(a: Int, b: Int, c: Int): Int = a + b + c
fun square(num: Int): Int = num * num
fun maxOfTwo(a: Int, b: Int): Int = maxOf(a, b)
fun isEven(num: Int): Boolean = num % 2 == 0
fun isPositive(n: Int): Boolean = n > 0
fun fahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9

fun greet(name: String): String = "Hello, $name"
fun repeatWord(word: String, times: Int): String = word.repeat(times)
fun lengthOfString(s: String): Int = s.length
fun reverseString(s: String): String = s.reversed()

fun play(age: Int): String {
    var message = if (age >= 18) {
        "Можно"
    } else if (age in 16..17) {
        "С ограничениями"
    } else { 
        "Нет"
    }
    return message
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65

fun play2(age: Int): String {

    return when (age) {
        in 1..17 -> "Нет"
        in AGE_OF_MAJORITY..RETIREMENT_AGE -> "Да"
        else -> "Нет (пенс. возраст)"
    }
}

val inp = readln()

val inpt = readln().toInt()

val input = readln().toIntOrNull()