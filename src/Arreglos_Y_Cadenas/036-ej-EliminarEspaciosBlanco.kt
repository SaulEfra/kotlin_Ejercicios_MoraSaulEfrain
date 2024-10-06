package Arreglos_Y_Cadenas

fun main (){
    println("ingresa una oracion");
    var palab = readln();
    // se utilizo replace que recibe un valor a remplazar y el nuevo valor
    var cadena = palab.replace(" ","");
    println(cadena)
}