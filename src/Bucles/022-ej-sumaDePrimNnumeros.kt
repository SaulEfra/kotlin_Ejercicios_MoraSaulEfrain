package Bucles

fun main (){
    try {
        // segun lo que investigue los numeros naturales no tienen decimal
        // por lo tanto si se ingresa un valor double este se combiertye a entero
        println("Ingrese un número n:")
        val num = readln().toDouble();
        var res = 0;
        // para saber que numeros naturales hay antes de un numero se define un
        // rango de entre el numero y 1
        for (i in 1 ..num.toInt()){
            res += i
        }
        // para sumar los valores se deben almacenar en un valor vacio en este caso res
        println("la suma es: $res");
    }catch (e:NumberFormatException){
        println("ERROR: escribe un valor valido $e");
    }
}