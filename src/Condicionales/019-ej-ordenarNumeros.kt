package Condicionales

fun main(){
    try {


        println("ingresa un numero: ")
        var num1 = readln().toDouble();
        println("ingresa otro numero: ")
        var num2 = readln().toDouble();
        println("ingresa otro numero: ")
        var num3 = readln().toDouble();

        // En este if se compruba si el primer numero es el mas grande
        if (num1 > num2 && num1 > num3) {
            println("El numero mas grande es: ${num1} ")
            if (num2 > num3 ){
                println("El numero medio es: ${num2}")
                println("El numero menor es: ${num3}")
            }else{
                println("El numero medio es: ${num3}")
                println("El numero menor es: ${num2}")
            }// en el segundo if se comprueba si el segundo numero es el mas grande
        }else if (num2 > num1 && num2 > num3){
            println("el numero mas grande es: ${num2}")
            if (num1 > num3){
                println("El numero medio es: ${num1}");
                println("El numero menor es: ${num3}");
            }else{
                println("El numero medio es: ${num3}");
                println("El numero menor es: ${num1}");
            }// en el tercer if se comprueba si el tercer numero es el mas grande
        }else if (num3 > num1 && num3 > num2){
            println("El numero mas grande es: ${num3}")
            if (num2 > num1){
                println("El numero medio es: ${num2}");
                println("El numero medio es: ${num1}");
            }else{
                println("El numero medio es: ${num1}");
                println("El numero medio es: ${num2}");
            }
        }else{//si no se cumple ninguna de las condiciones anteriores existe
            // la posibilidad de que sean iguales
            println("los numeros son iguales")
        }


    }catch(e:NumberFormatException){
    println("ingresa un valor valido")
    }
}