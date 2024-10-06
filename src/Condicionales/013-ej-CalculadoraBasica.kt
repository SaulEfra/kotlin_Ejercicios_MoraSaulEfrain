package Condicionales

fun main (){

        try {
            println("ingresa el primer numero")
            var num1 = readln().toDouble();

            println("ingresa el segundo numero");
            var num2 = readln().toDouble();

            println("selecciona una operacion ");
            println("1: Suma ");
            println("2: Resta ");
            println("3: Multiplicacion");
            println("4: Divicion");
            var operacion = readln().toInt();
            when(operacion){
                1-> println("La suma es: "+(num1+num2));
                2-> println("La resta es: "+(num1-num2));
                3-> println("La multiplicacion es: "+(num1*num2));
                4-> println("La divicion es: "+(num1/num2));
                else-> println("El numero no es valido");
            }

        }catch(e:NumberFormatException){
            println("ingresa un valor valido")
        }
}