package Condicionales

fun main (){
    while (true){
        try {
            println("ingresa un año: ");
            var año = readln().toInt();

            if ( año%4==0 ){
                println("es un año bisiesto")
            }else{
                println("es un año normal")
            }
            break;
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
}