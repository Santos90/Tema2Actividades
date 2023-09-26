package com.example.tema2actividades

fun main() {
    //11.Confeccionar una función que reciba una serie de edades y nos retorne la cantidad
    //que son mayores o iguales a 18 ( como mínimo se envía un entero a la función).
    //Utiliza vararg para implementarlo.
    println("Las edades de un grupo de perosonas son 12, 18, 45, 26, 17." +
                    " De ellas ${mayorDeEdad(12,18,45, 26, 17)} son mayores de edad.")

    println("Las edades de un grupo de perosonas son 12, 18, 45, 26, 17, 22, 78, 1 ,33." +
                    " De ellas ${mayorDeEdad(12,18,45, 26, 17,  22, 78, 1 ,33)} son mayores de edad.")

}

fun mayorDeEdad (vararg numeros:Int) : Int {
    var cant = 0
    for (n in numeros) if (n >= 18) cant += 1
    return cant
}


// val primerNumeroPar = valores.count