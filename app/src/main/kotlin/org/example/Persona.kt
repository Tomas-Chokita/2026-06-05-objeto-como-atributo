package org.example

class Persona(
    private val nombre: String,
    private val apellido: String,
    private val fechaNacimiento: Fecha
) {
    override fun toString(): String {
        return "Me llamo $nombre $apellido y naci el ($fechaNacimiento)"
    }
}
