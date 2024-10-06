package Condicionales

fun main() {
    while (true){
        try {
            println("ingresa tu edad : ");
            var edad = readln().toInt();
            if (edad>=18){
                println("puedes votar")
            }else{
                println("no puedes votar")
            }

            break;
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
}