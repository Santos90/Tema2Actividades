package com.example.tema2actividades

fun main() {
    //5. Desarrollar un programa con dos funciones. La primera que solicite el ingreso de un entero
    //y muestre el cuadrado de dicho valor. La segunda que solicite la carga de dos valores y
    //muestre el producto de los mismos. Llamar desde la main a ambas funciones.

    val a = 5
    val b = 3
    println("$a² = ${elevarAlCuadrado(a)}")
    println("$a * $b = ${multiplicar(a, b)}")
}

fun elevarAlCuadrado (a:Int) = a * a
fun multiplicar (a:Int, b:Int) = a * b
