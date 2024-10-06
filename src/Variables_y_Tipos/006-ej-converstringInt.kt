package Variables_y_Tipos

fun main () {

    while (true){
        try {

            println("ingresa un numero: ");
            var celsius2 = readln().toInt();
            println("el tipo es INT")

            break;
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
}


