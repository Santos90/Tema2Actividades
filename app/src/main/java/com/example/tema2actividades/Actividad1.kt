package com.example.tema2actividades

fun main() {
    //1. Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado, en
    //otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
    //Mostrar la superficie y el perímetro en la Consola.

    val lado = 50
    val superficie = lado*lado
    //superficie = Math.pow(lado.toDouble(), 2.0).toInt()
    val perimetro = lado*4

    println("El lado del cuadrado es de $lado cm, su superficie es de $superficie cm² y su perimetro es de $perimetro cm")
}