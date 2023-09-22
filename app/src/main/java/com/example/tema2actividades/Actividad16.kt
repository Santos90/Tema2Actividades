package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //16. Ingresar 10 valores enteros por teclado. Contar cuántos de dichos valores ingresados
    //fueron 0, y cuántos de valores diferentes a 0. Recuerda utilizar la cláusula when.
    val sc = Scanner(System.`in`)

    var valor:Int
    var ceros = 0
    var noCeros = 0
    for (i in 1 until 11) {
        print("Introduce el valor ${i}: ")
        valor = sc.nextInt()
        when (valor) {
            0 -> ceros++
            else -> noCeros++
        }
    }

    println("Valores iguales a cero: $ceros")
    println("Valores diferentes a cero: $noCeros")


}