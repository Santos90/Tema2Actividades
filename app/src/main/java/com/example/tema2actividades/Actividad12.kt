package com.example.tema2actividades

fun main() {
    //12.Crea una función Infix llamada “esMayorQue” que tome dos números como
    //parámetros y devuelva true si el primero es mayor que el segundo, de lo contrario,
    //devuelve false. Puedes utilizarla para comparar dos números.

    var n1 = 3
    var n2 = 2

    if (n1 esMayorQue n2) println("$n1 es mayor q $n2")
    else println("$n1 NO es mayor q $n2")

    n1 = 4
    n2 = 6

    if (n1.esMayorQue(n2)) println("$n1 es mayor q $n2")
    else println("$n1 NO es mayor q $n2")

}

infix fun Int.esMayorQue (n2:Int) = this > n2