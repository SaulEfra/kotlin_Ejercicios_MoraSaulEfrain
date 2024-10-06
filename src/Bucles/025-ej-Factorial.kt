package Bucles

fun main(){
    try {
        println("ingresa un numero");
        var num = readln().toInt();
        var res = 1;
        // para calcular el factorial se debe multiplicar por el numero anterior y el resultado
        // por el numero anteriror al anteriror hasta llegar a 1
        // en este caso se empieza por 1 y se va hacia arriba el orden no afecta
        // el resultado se almnacena en una variable y se muestar al final
        for (i in 1 .. num){
            res *= i
        }
        println("El factorial es: $res")
    }catch (e:NumberFormatException){
        println("ingresa un valor valido")
    }
}