package Bucles

fun main(){
    try {
        println("ingresa un numero")
        var num = readln().toInt();
        var cont : Int = 1;
        while (cont < 11){
            var multi =  num * cont
            println( "${cont} * ${num} = ${multi}")
            cont++
        }
    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}