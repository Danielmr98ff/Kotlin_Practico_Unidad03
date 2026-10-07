package com.example.Ejercicio1.Ejercicio2

class Persona(string: String, string1: String, string2: String) {
    val nombre: String = ""
    val apellido: String = ""


    var telefono: String = ""
        set(value) {
            if (value.length == 9 && value.all { it.isDigit() }) {
                field = value
            } else {
                println("Error: El teléfono $value debe tener 9 dígitos.")
            }
        }


}
