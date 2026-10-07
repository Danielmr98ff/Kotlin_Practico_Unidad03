package Ejercicio2

class Cuenta(
    var numeroCuenta: String = "",
    saldoInicial: Double = 0.0,
    var propietario: Persona = Persona("Carlos", "Gómez", "612345678")
) {

    var saldo: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println(" Error: El saldo no puede ser negativo ($value).")
            }
        }


    init {
        this.saldo = saldoInicial
    }


    fun transaccion(cantidad: Double, tipoTransaccion: String) {
        if (tipoTransaccion.lowercase() == "ingreso") {
            this.saldo += cantidad
            println("Transacción realizada [INGRESO]: +$cantidad€. Nuevo saldo: $saldo€")
        } else if (tipoTransaccion.lowercase() == "reintegro") {
            if (this.saldo - cantidad >= 0) {
                this.saldo -= cantidad
                println("Transacción realizada [REINTEGRO]: -$cantidad€. Nuevo saldo: $saldo€")
            } else {
                println(" Reintegro fallido: Fondos insuficientes para retirar $cantidad€. Saldo actual: $saldo€")
            }
        } else {
            println(" Tipo de transacción no válido. Usa 'ingreso' o 'reintegro'.")
        }
    }

    override fun toString(): String {
        return "Cuenta(numeroCuenta='$numeroCuenta', saldo=$saldo, propietario=$propietario)"
    }
}
