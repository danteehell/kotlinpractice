package org.example.app.strings

fun chess() {
    var whereFrom: String = "e2"
    var whereTo: String = "e4"
    var stepNumber: Int = 1

    println("$whereFrom-$whereTo;$stepNumber")

    whereFrom = "d2"
    whereTo =  "d3"
    stepNumber++
    println("$whereFrom-$whereTo;$stepNumber")
}