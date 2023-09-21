package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //9. Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
    //mismos. La impresión del promedio se realiza en el main
    val scanner = Scanner(System.`in`)
    println("Calcula el promedio de tres numeros")
    println("Intoduce 3 valores")

    print("Valor 1: ")
    val n1 = scanner.nextFloat();
    print("Valor 2: ")
    val n2 = scanner.nextFloat();
    print("Valor 3: ")
    val n3 = scanner.nextFloat();

    println("El valor promedio de los tres números es ${promedio(n1, n2, n3)}")

}

fun promedio (n1:Float, n2:Float, n3:Float) : Float {
    return (n1+n2+n3)/3f
}