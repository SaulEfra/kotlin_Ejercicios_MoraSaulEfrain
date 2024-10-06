package Arreglos_Y_Cadenas

fun main (){
    println("ingresa una oracion o palabra ");
    var palab = readln();
    // para contar las vocales se utiliza count para contar
    // los caracteres que cumplan con la condicion
    // en este caso se combierten lkos caracteres a minuscula con tolowercase
    // y se verifica si estan los valores aeiou con "in"
    var res = palab.count { it.toLowerCase() in "aeiou" }
    println(res)
}