package Ejercicio1

fun main() {

    var objetoX: SerVivo = SerVivo(6)
    var objetoY: SerVivo = SerVivo(5)


    val mayorSerVivo = objetoX.mayor(objetoY)
    println("El SerVivo mayor es: $mayorSerVivo")


    val homero = Humano(34, "Homero")
    val bart = Humano(9, "Bart")


    objetoX = homero
    objetoY = bart


    val mayorHumano = homero.mayor(bart)
    println("El Humano mayor es: $mayorHumano")
}


