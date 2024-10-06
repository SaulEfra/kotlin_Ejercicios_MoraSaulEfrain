package Variables_y_Tipos

fun main (){

    try {
        println("ingresa un numero: ");
        var num1 = readln().toDouble();
        var result = num1 * 2;
        var result2 = num1 /2;
        println("El doble es: $result "+"Y la mitad es $result2")

    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}