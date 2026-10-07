package com.example.Ejercicio1.Ejercicio3

class ProductoRefrigerado (
fechaCaducidad:String,
    numeroLote:String,
    var codigoSupervision: String
): Producto(fechaCaducidad,numeroLote){

    override fun mostrarInformacion() {
        println("Producto  Refrigerado")
        super.mostrarInformacion()
        println("Codigo de Supervision: $codigoSupervision")

    }
}
