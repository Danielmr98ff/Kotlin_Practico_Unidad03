package com.example.Ejercicio1.Ejercicio1

open class SerVivo   (open val edad: Byte){

    override fun equals(other: Any?): Boolean{
        if (other is SerVivo){
            return  this.edad== other.edad
        }
        return false
    }
    fun mayor (otro: SerVivo): SerVivo{
        if (this.edad >=otro.edad){
            return this
        }else{

            return otro
        }
    }

    override fun toString(): String {
            return "SerVivo -> Edad: $edad"
    }
}