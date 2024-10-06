package Bucles

fun main (){
    try {
        println("Ingresa un numero")
        var num = readln().toInt();

        for (i in 1 .. num){
//            if (i % 5 == 0){
//                println("$i")
//            }
            // lo que vi en mi investigacion es que los multiplos de un numero
            // son el resultado de la multiplicacion del numero por otro numero
            var res = num * i;
            println(" $res")
        }
    }catch (e:NumberFormatException)
    {
        println("ingresa un valor valido")
    }
}