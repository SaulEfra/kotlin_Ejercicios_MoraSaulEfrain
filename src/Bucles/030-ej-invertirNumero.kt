package Bucles

fun main (){
    try {
        println("Ingresa un numero entero");
        var num = readln().toInt();
        var res = num.toString();
        var res2 = res.reversed();
        println(res2)
    }catch (e:NumberFormatException){
        println("Ingresa un valor valido")
    }
}