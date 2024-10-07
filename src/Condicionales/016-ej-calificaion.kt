package Condicionales

fun main (){
    while (true){
        try {
            println("ingresa tu calificaion del 1 - 100: ");
            var calif = readln().toDouble();
            when(calif){
                in 1.0 .. 59.9 -> println("Calificacion: F");
                in 60.0 .. 69.9 -> println("Calificacion: D");
                in 70.0 .. 79.9 -> println("Calificacion: C");
                in 80.0 .. 89.9 -> println("Calificacion: B");
                in 90.0 .. 100.0 -> println("CAlificacion: A");
                else -> println("calificaicon no valida")
            }
            break;
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
}