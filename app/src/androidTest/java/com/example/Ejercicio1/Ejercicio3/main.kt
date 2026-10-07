package com.example.Ejercicio1.Ejercicio3

fun main(){

    val leche= ProductoFresco("25/5/2027","204","14/5/2027","España")
    val queso=ProductoRefrigerado("05/12/2026","451","784520-4")
    val pizza =ProductoCongelado("4/8/227","l-475",0.3)

    leche.mostrarInformacion()
    queso.mostrarInformacion()
    pizza.mostrarInformacion()

}
