package com.example.tema2actividades.Actividad17

class LibroDigital(
    titulo: String,
    autor: String,
    añoPublicacion:Int,
    precio: Double,
    protected var formato: String) : Libro (titulo, autor, añoPublicacion, precio) {

    fun LibroDigital () {
        formato = "null"

    }

    override fun calcularPrecioDescuento(): Double {
        return precio * 0.8
    }

    override fun toString(): String {
        return super.toString() + "\nFormato: $formato"
    }



}