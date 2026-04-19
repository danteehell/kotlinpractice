package org.example.app

import org.example.app.strings.chess
import org.example.app.strings.hello
import org.example.app.strings.lastName
import org.example.app.strings.multiplication


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Functions")

    println(sum(2, 3))
    println(sumThree(1, 2, 3))
    println(square(4))
    println(maxOfTwo(10, 20))
    println(isEven(6))
    println(isPositive(5))
    println(fahrenheitToCelsius(212.0))

    println(greet("Darya"))
    println(repeatWord("Hi", 3))
    println(lengthOfString("Hello"))
    println(reverseString("hello"))

    println("======================================")

    println(hello())
    println(lastName())
    println(multiplication(8))
    println(chess())
}
