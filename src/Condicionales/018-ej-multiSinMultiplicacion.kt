package Condicionales

fun main (){
    try {

        // otra manera de multiplicar es sumar

        println("ingresa un numero: ")
        var num1 = readln().toInt();
        println("ingresa otro numero: ");
        var num2 = readln().toInt()
        // si se esta multiplicando
        // el primer numero se debe sumar asi mismo
        // el mismo numero de veces que el segundo numero dado
        var res = 0;
        for (i in 1 .. num2){
            res += num1;
        }
        println("El resultado de la multiplicacion es: $num1 * $num2 = $res")

    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}