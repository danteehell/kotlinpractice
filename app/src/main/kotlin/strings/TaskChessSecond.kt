package org.example.app.strings

fun chessParse() {
    val chessParam: String = "D2-D4;0"
    val chessParamArray = chessParam.split(";")
    val chessSquares = chessParamArray[0].split("-")

    val squareFrom = chessSquares[0]
    val squareTo = chessSquares[1]
    val stepNumber = chessParamArray[1]

    println(squareFrom)
    println(squareTo)
    println(stepNumber)


}