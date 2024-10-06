package Arreglos_Y_Cadenas

fun main (){
    println("ingresa una palabra");
    var palabra = readln();
    // para voltear una cadena se uso reversed que invierte los valores
    var res = palabra.reversed()
    println(" $palabra al reves es $res")
}