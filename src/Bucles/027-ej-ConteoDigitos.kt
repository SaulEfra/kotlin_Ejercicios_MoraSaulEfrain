package Bucles

fun main (){
    try {
        println("ingresa un numero: ")
        var num = readln().toInt();
        var num2 = num.toString()
        // para contar los digitos se combierte a cadena y se
        // cuentan los digitos
        var res = num2.length
        println("El numero de digitos es: $res");
    }catch (e:NumberFormatException){
        println("ERROR: escribe un valor valido o entero $e");
    }
}

