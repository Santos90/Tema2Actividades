package com.example.tema2actividades.Actividad17

import android.annotation.SuppressLint

open class Libro (
    protected var titulo: String,
    protected var autor: String,
    protected var añoPublicacion: Int,
    protected var precio: Double
){


    fun Libro (){
        titulo = ""
        autor = ""
        añoPublicacion = 0
        precio = 0.0

    }

    override fun toString(): String {
        return "Título: $titulo\n" +
                "Autor: $autor\n" +
                "Año de publicación: $añoPublicacion\n" +
                "Precio: $precio"

    }

    open fun calcularPrecioDescuento(): Double {
        return precio * 0.9
    }






}