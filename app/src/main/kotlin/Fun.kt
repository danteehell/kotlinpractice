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