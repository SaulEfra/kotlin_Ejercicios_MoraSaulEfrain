package Bucles

fun main (){
    println("Ingresa un numero: ");
    var num = readln().toInt();
    // la variable se almacena y se combierte a cadena y se divide en una lista
    // luego se combierten a numeros enteros y se suman
    val sumaDigitos = num.toString().map { it.toString().toInt() }.sum()
    println(sumaDigitos)
}