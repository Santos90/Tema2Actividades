package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //7. En la función main solicitar que se ingrese una clave dos veces por teclado. Desarrollar una
    //función que reciba dos String como parámetros y muestre un mensaje si las dos claves
    //ingresadas son iguales o distintas.
    val sc = Scanner(System.`in`)

    print("Ingresa una contraseña: ")
    val c1 = sc.nextLine()

    print("Repite la contraseña: ")
    val c2 = sc.nextLine()

    if (clavesIguales(c1,c2)) println("Son iguales")
    else println("Las claves NO coinciden")

}

fun clavesIguales (c1:String, c2:String):Boolean {
    return c1 == c2;
}