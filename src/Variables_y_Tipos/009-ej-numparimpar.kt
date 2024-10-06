package Variables_y_Tipos


fun main (){
    try {
        println("ingresa un numero Entero: ");
        var numero = readln().toInt();
        if ( (numero%2)==0 ){
            println("El numero es par")
        }else{
            println("el numero es impar")
        }

    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}
