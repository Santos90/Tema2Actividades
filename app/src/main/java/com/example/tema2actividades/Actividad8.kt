package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //8. Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a
    //mayor. En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la
    //primera funcion definida
    println("Ordena de menor a mayor 3 enteros")
    val scanner = Scanner(System.`in`)
    print("Valor 1: ")
    val n1 = scanner.nextInt();
    print("Valor 2: ")
    val n2 = scanner.nextInt();
    print("Valor 3: ")
    val n3 = scanner.nextInt();

    ordenaInts(n1, n2, n3)
}

fun ordenaInts (n1:Int, n2:Int, n3:Int) {

    val list = mutableListOf(n1, n2, n3)
    list.sort()
    print("Números ordenados: ")
    for (a in list) print("$a, ")


}