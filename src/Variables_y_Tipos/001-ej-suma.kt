package Variables_y_Tipos

fun main (){

    try {
        println("Ingresa el primer numero");
        var num1 = readln().toDouble();
        println("Ingresa el segundo numero")
        var num2 = readln().toDouble();

        var result = num1 + num2;
        println("El resultado es: "+ result);
    }catch (e:NumberFormatException){
        println("ingresa un valor valido")
    }

}