package com.example.tema2actividades

fun main() {
    //13. Cargar un array de 10 elementos de tipo entero y verificar posteriormente si el mismo está
    //ordenado de menor a mayor.

    var arr = IntArray(10) { it * 1 }
    var lista = arr.sortedArray()

    imprimirArray(arr)
    imprimirArray(lista)

    if (arr == lista) println("Esta ordenado de menor a mayor")
    else println("No esta ordenado de menor a mayor")


}

fun imprimirArray(a:IntArray) {
    a.size
    for (num in a) {
        print("$num, ")
    }
    println()

 //   for (i in 0  until a.size-1) {
}

