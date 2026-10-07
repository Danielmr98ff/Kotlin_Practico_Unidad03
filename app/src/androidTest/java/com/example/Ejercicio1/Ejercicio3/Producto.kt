package com.example.Ejercicio1.Ejercicio3

open class Producto(
    var fechaCaducidad: String,
    var numeroLote: String) {


    open fun mostrarInformacion(){
        println("Fecha de caducidad: $fechaCaducidad")
        println("Numero de lote: $numeroLote")
    }


}