package com.example.tema2actividades

fun main() {
    //2. Definir tres variables inmutables y cargar por asignación los pesos de tres personas con
    //valores Float. Calcular el promedio de pesos de las personas y mostrarlo. Mostrar también
    //el promedio redondeado a 2 cifras.

    val peso1 = 58.69f
    val peso2 = 90.67f
    val peso3 = 63.68f

    var promedio:Float = (peso1 + peso2 + peso3) / 3
    var promedioRedondeado = Math.round(promedio * 100.0)/100.0

    println("El valor promedio de los pesos (en Kg) $peso1, $peso2 y $peso3 es de $promedio")


}