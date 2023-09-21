package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //6. Desarrollar una función que solicite la carga de tres valores y muestre el menor. Desde la
    //función main del programa llamar 2 veces a dicha función (sin utilizar una estructura
    //repetitiva)

    minimoDeTres()
    minimoDeTres()


}

fun minimoDeTres () {
    val scanner = Scanner(System.`in`)
    println("Calcula el minimo de tres enteros")
    println("Intoduce 3 valores")

    print("Valor 1: ")
    val n1 = scanner.nextInt();
    print("Valor 2: ")
    val n2 = scanner.nextInt();
    print("Valor 3: ")
    val n3 = scanner.nextInt();

    var min = n1
    if (n2 < min) min = n2
    if (n3 < min) min = n3

    println("El número mínimo es $min \n")

}