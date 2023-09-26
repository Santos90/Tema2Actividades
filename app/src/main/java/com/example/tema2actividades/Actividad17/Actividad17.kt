package com.example.tema2actividades.Actividad17

fun main () {
    //En la función main, crea varios objetos de tipo Libro y LibroDigital. Llama a la función
    //calcularPrecioDescuento en cada uno de ellos y muestra el precio con descuento en la consola.

    val libro = Libro("Ensayo sobre la ceguera", "Saramago", 1995, 15.0 )
    val libro2 = Libro("El capital", "Karl Marx", 1875, 25.0 )
    val libro3 = LibroDigital("Ensayo sobre la ceguera", "Saramago", 1995, 15.0, "EPUB" )
    val libro4 = LibroDigital("El capital", "Karl Marx", 1875, 25.0, "PDF" )

    System.out.println("Precio de descuento: ${libro.calcularPrecioDescuento()}")
    System.out.println("Precio de descuento: ${libro2.calcularPrecioDescuento()}")
    System.out.println("Precio de descuento: ${libro3.calcularPrecioDescuento()}")
    System.out.println("Precio de descuento: ${libro4.calcularPrecioDescuento()}")


}