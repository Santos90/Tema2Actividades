package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //15. Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por
    //teclado. Elaborar dos funciones, una donde se cree y cargue el array y otra que sume todos
    //sus elementos y retorne dicho valor al main donde se imprima.

    val sc = Scanner(System.`in`)
    print("Introduce la cantidad de elementos a sumar: ")
    val arr = introducirArray(sc.nextInt())
    val sumArr = sumaArray(arr)
    println("La suma total de los elementos es de $sumArr")
}

fun introducirArray (cant:Int): IntArray {
    val sc = Scanner(System.`in`)
    var arr = IntArray(cant)
    for (i in 0 until cant) {
        print("Introduce el valor ${i + 1}: ")
        arr[i] = sc.nextInt()
    }
    return arr
}

fun sumaArray (arr:IntArray): Int {
    var suma = 0
    for (i in 0 until arr.size) suma += arr[i]
    return suma
}