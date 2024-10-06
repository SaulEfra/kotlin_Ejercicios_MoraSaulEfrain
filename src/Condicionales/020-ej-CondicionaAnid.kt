package Condicionales

fun main (){
    try {
        println("ingresa un numero para saber el mes: ");
        var dia = readln().toInt();
        when(dia){
            1-> println("Enero");
            2-> println("Febrero");
            3-> println("Marzo");
            4-> println("Abril");
            5-> println("Mayo");
            6-> println("Junio");
            7-> println("Julio");
            8-> println("Agosto");
            9-> println("Septiembre");
            10-> println("Octubre");
            11-> println("Noviembre");
            12-> println("Diciembre")
            else-> println("El numero no es valido");
        }
    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}