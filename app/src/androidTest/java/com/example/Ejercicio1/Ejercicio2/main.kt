package com.example.Ejercicio1.Ejercicio2

fun main() {
    val persona1 = Persona("Carlos", "Gómez", "612345678")
    val persona2 = Persona("Ana", "Martínez", "699887766")


    val cuenta1 = Cuenta("ES1234567890", 500.0, persona1)
    val cuenta2 = Cuenta("ES0987654321", 1000.0, persona2)

    println(" ESTADO INICIAL DE LAS CUENTAS")
    println(cuenta1)
    println(cuenta2)

    println(" TRANSACCIONES EN CUENTA 1 (Carlos) ")
    cuenta1.transaccion(200.0, "ingreso")
    cuenta1.transaccion(100.0, "reintegro")

    println(" TRANSACCIONES EN CUENTA 2 (Ana) ")
    cuenta2.transaccion(500.0, "reintegro")
    cuenta2.transaccion(300.0, "ingreso")

    println("ESTADO FINAL DE LAS CUENTAS Y PROPIETARIOS ")
    println(cuenta1)
    println(cuenta2)
}