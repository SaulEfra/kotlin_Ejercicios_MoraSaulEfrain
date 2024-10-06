package Variables_y_Tipos

fun main (){
    try {
        println("Introduce los grados celsius")
        var celsius = readln().toDouble();

        var result = celsius * 9 / 5 + 32;
        println("Los grados Fahrenheit son: "+result);
    }catch (e: NumberFormatException){
        println("ingresa un valor valido")
    }
}