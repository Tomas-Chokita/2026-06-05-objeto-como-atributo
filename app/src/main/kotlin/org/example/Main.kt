package org.example

fun main() {
    println(Persona("Pepe", "Honguito", Fecha(5, 6, 2026)))
    println(Polinomio())
    println(Cuadratica())
    println(CuadraticaMejor())
    var objeto:Polinomio
    objeto=Cuadratica()
    println(objeto)
    objeto=CuadraticaMejor()
    println(objeto)
    var lista=ArrayList<Polinomio>()
    for (var p:lista)
    println (p)
}

