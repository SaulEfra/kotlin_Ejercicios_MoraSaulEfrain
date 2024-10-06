package Variables_y_Tipos

fun main (){
    try {

        println("ingresa el primer numero")
        var num1 = readln().toDouble();
        println("ingresa el segundo numero")
        var num2 = readln().toDouble();
        println("Ingresa el tercer valor");
        var num3 = readln().toDouble();
        var result = (num1 + num2 + num3)/3
        println("El promedio es: "+result)

    }catch (e:NumberFormatException){
        println("ingresa un valor valido")
    }
}