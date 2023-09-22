package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //14. Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
    //Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un
    //tercer arreglo del mismo tamaño.
    println("Arreglo 1:")
    var arr1 = introducirArreglo(4)
    println("Arreglo 2:")
    var arr2 = introducirArreglo(4)

    var sumArr = IntArray(4)

    println("Suma de arreglos:")
    for (i in 0 until sumArr.size) {
        sumArr[i] = arr1[i] + arr2[i]
        print("${sumArr[i]}, " )
    }

}

fun introducirArreglo (cant:Int): IntArray {
    val sc = Scanner(System.`in`)
    var arr = IntArray(cant)
    for (i in 0  until cant) {
        print("Introduce el valor ${i+1}: ")
        arr[i] = sc.nextInt()
    }
    return arr
}