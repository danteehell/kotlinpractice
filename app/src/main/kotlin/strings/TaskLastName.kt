package org.example.app.strings

fun lastName() {
    val firstName: String = "Татьяна"
    val middleName: String = "Сергеевна"
    var lastName: String = "Андреева"

    var age: Int = 20

    println("$lastName $firstName $middleName $age")

    lastName = "Сидорова"
    age = 22
    println("$lastName $firstName $middleName $age")



}