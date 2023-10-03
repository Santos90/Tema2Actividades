package com.example.tema2actividades.Actividad18

import java.util.Scanner


fun main () {
    var listaTareas = mutableListOf<Tarea>()

    //1. Utiliza una función de alcance (apply o with) para crear e inicializar una lista mutable de
    //tareas con algunas tareas de ejemplo.
    //2. Utiliza otra función de alcance para agregar, modificar y listar tareas en la lista que creaste
    //en el paso anterior

    with (listaTareas) {
        add(Tarea("Fer el dinar", "Tallar verdures i sofregir-les" , Prioridad.MEDIA, false ))
        add(Tarea("Fer el sopar", "Tallar verdures i sofregir-les" , Prioridad.BAJA, false ))
        add(Tarea("Fer els deures", "Fer exercicis" , Prioridad.ALTA, false ))
        add(Tarea("Estudiar", "Repassar Kotlin" , Prioridad.ALTA, false ))
    }

    listaTareas.apply {
        get(0).completada = true;
        get(3).prioridad = Prioridad.MEDIA;
    }

    var tar = Tarea("Dormir", "descans" , Prioridad.MEDIA, false )
    agregarTarea(tar, listaTareas)

    modificarTarea( listaTareas,"Dormir")


    var listaPrio = listarTareasPorPrioridad(listaTareas, Prioridad.MEDIA)
    println(listaPrio.toString())




}
//1. Crea una función llamada “agregarTarea” que toma una lista mutable de tareas y una nueva
//tarea como parámetros, y agregue la tarea a la lista.
fun agregarTarea (tarea:Tarea, lista:MutableList<Tarea>) {
    lista.add(tarea)
}
//2. Crea una función llamada “modificarTarea” que toma una lista mutable de tareas, el
//nombre de la tarea que se desea modificar y una función lambda que modifique los
//detalles de la tarea.
fun modificarTarea (lista:MutableList<Tarea>, name: String) {
    for (tarea in lista) {
        if (tarea.nombre == name) {
            val scanner = Scanner(System.`in`)
            tarea.apply {
                print("Introduce el nombre de la tarea: ")
                nombre = scanner.nextLine()
                print("Introduce la descripción de la tarea: ")
                descripcion = scanner.nextLine()
            }
        }
    }

}

//3. Crea una función llamada “listarTareasPorPrioridad” que tome una lista de tareas y una
//prioridad como parámetros, y devuelva una lista de tareas con esa prioridad.

fun listarTareasPorPrioridad (lista:MutableList<Tarea>, prio: Prioridad): MutableList<Tarea> {
    var listaPrio = mutableListOf<Tarea>()
    for (tarea in lista) {
        if (tarea.prioridad == prio) {
            listaPrio.add(tarea)
        }
    }
    return listaPrio
}