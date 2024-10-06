package Bucles

fun main (){
    println("ingresa un numero: ")
    var num = readln().toInt();
    // investigue que un numero primo es aquel que solo se puede dividir
    // entre si mismo y uno por lo tanto si se divide entre 2 y el residuo
    // es diferente de 0 entonces es un numero primo
    if ( num % 1 == 0 && num % num == 0 && num % 2 != 0){
        println("$num es un numero p´rimo")
    }else{
        println("no es un numero primo")
    }
}