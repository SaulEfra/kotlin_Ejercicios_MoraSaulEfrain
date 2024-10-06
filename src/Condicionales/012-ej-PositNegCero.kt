package Condicionales

fun main (){
    try {
        println("ingresa un numero");
        var num = readln().toInt();

        if (num > 0){
            println("es un numero positivo")
        }else if (num == 0){
            println("es cero")
        }else{
            println("es un numero negativo")
        }
    }catch (e:NumberFormatException){
        println("ingrese un valor valido")
    }
}