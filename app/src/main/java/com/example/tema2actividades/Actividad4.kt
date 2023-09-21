package com.example.tema2actividades

import java.util.Scanner

fun main() {
    //4. Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad
    //que lleva el cliente. Mostrar lo que debe abonar el comprador.

    val scanner = Scanner(System.`in`)

    print("Ingresa el precio del producto (usa comas para los decimales): ")
    var precio = scanner.nextFloat()

    print("Ingresa las unidades del producto: ")
    var cantidad = scanner.nextInt()

    println("La cantidad a abonar es de ${precio * cantidad} €")

}