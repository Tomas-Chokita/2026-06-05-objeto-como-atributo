package org.example

data class Fecha(
    private val dia: Int,
    private val mes: Int,
    private val anio: Int
) {
    override fun toString(): String {
        return String.format("%02d/%02d/%04d", dia, mes, anio)
    }
}