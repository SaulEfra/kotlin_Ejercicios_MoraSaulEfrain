package Variables_y_Tipos

fun main (){
    try {
        println("ingresa los metros: ");
        var numero = readln().toDouble();
        var res = numero/1000;
        println("$res kilometros")

    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}