package Ejercicio1



class Humano (override val edad: Byte,
              val nombre: String): SerVivo(edad) {

    override fun equals(other: Any?): Boolean{

        if (other is Humano){
            return  this.edad == other.edad && this.nombre== other.nombre
        }
        return false
    }

    fun mayor (otro: Humano): Humano{

        if (this.edad>otro.edad){
            return this
        }else if (otro.edad>this.edad){
            return otro
        }else{

            if (this.nombre.length>=otro.nombre.length){
                return this
            }else{

                return otro
            }
        }
    }

    override fun toString(): String {
        return "Humano->Nombre: $nombre, Edad: $edad"
    }
}