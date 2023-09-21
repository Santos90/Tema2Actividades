package com.example.tema2actividades

fun main() {
    //10.Hacer una función que reciba una cantidad variable de enteros y retorne su suma.
    //Utiliza vararg para implementarlo.

    println("La suma de 2 + 5 = ${suma(2,5)}")
    println("La suma de 2 + 5 + 7 + 13 = ${suma(2,5, 7, 13)}")


}

fun suma (vararg numeros:Int) : Int {
    var suma = 0
    for (n in numeros) suma += n
    return suma
}