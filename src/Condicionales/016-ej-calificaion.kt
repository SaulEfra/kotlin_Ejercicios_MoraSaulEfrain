package Condicionales

fun main (){
    while (true){
        try {
            println("ingresa tu calificaion del 1 - 100: ");
            var calif = readln().toDouble();
            when(calif){
                in 1.0 .. 19.9 -> println("Calificacion: F");
                in 20.0 .. 39.9 -> println("Calificacion: D");
                in 40.0 .. 59.9 -> println("Calificacion: C");
                in 60.0 .. 79.9 -> println("Calificacion: B");
                in 80.0 .. 100.0 -> println("CAlificacion: A");
                else -> println("calificaicon no valida")
            }
            break;
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
}