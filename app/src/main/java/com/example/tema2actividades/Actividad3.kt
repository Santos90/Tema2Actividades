package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //3. Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la
    //suma de los dos primeros y el producto del tercero y el cuarto. Realizar los cálculos en el
    //mismo print.
    val scanner = Scanner(System.`in`)
    var a:Int
    var b:Int

    print("Ingresa el primer número de la suma: ")
    a = scanner.nextInt()
    print("Ingresa el segundo número de la suma: ")
    b = scanner.nextInt()
    println("$a + $b = ${a+b}")


    print("Ingresa el primer número de la multiplicación: ")
    a = scanner.nextInt()
    print("Ingresa el segundo número de la multiplicación: ")
    b = scanner.nextInt()
    println("$a * $b = ${a*b}")
}