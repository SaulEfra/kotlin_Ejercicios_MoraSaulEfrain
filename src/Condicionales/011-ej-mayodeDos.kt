package Condicionales

fun main (){
    try {
        println("ingresa un numero: ");
        var numero = readln().toDouble();
        println("ingresa otro numero: ");
        var numero2 = readln().toDouble();
        if (numero>numero2){
            println("el numero $numero es mayor que $numero2")
        }else{
            println("el numero $numero2 es mayor que $numero")
        }
    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}