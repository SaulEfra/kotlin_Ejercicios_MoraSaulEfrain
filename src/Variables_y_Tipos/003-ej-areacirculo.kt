package Variables_y_Tipos

fun main (){
    try {
        println("ingresa el radio");
        val pi : Double = 3.1416;
        var radio = readln().toDouble();

        var result = (radio*radio)*pi
        println("El resultado es: "+result)

    }catch (e:NumberFormatException){
        println("ingresa un valor valido")
    }
}