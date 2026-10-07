package com.example.Ejercicio1.Ejercicio3

class ProductoFresco(
    fechaCaducidad: String,
    numeroLote: String,
    var fechaEnvasado: String,
    var paisOrigen: String
    ) : Producto(fechaCaducidad,numeroLote){
    override fun mostrarInformacion() {
        println("Producto Fresco")
        super.mostrarInformacion()
        println("Fecha de envasado: $fechaEnvasado")
        println("Pais de origen: $paisOrigen")
    }
}

