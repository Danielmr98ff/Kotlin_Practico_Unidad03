package com.example.Ejercicio1.Ejercicio3

class ProductoCongelado (
    fechaCaducidad: String,
    numeroLote: String,
    var tempRecomendada: Double
): Producto(fechaCaducidad,numeroLote){

    override fun mostrarInformacion() {
        println("producto Congelado")
        super.mostrarInformacion()
        println("Temperatera Recomendada: $tempRecomendada")
    }
}


