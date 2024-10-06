package Arreglos_Y_Cadenas

fun main (){
    print("Ingrese una palabra ")
    // se combierte la cadena a minusculas se eliminan los espacios por cadenas vacias
    val palabra = readln().lowercase()?.replace("\\s".toRegex(), "") ?: ""
    // luego se compara si la palabra es igual a la palabra pero al reves
    val esPalindromo = palabra == palabra.reversed()
    // si resulta que es verdadero devuelve que es palindromo si no no lo es
    println(if (esPalindromo) "Es un palíndromo" else "No es un palíndromo")
}