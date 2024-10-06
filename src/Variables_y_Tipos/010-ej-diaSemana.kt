package Variables_y_Tipos

fun main (){
        try {
            println("ingresa un numero para saber el dia de la semana: ");
            var dia = readln().toInt();
            when(dia){
                1-> println("lunes");
                2-> println("martes");
                3-> println("miercoles");
                4-> println("Jueves");
                5-> println("viernes");
                6-> println("Sabado");
                7-> println("Domingo")
                else-> println("El numero no es valido");
            }
        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
    }
