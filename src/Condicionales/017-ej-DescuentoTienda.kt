package Condicionales

fun main (){
    try {
        println("Ingresa el precio de un producto")
        var precio = readln().toDouble();
        if(precio > 1000){
            var pors = (precio/100) * 20
            var desc = precio - pors
            println("el precio total con descuento es de ${desc}")
        }else{
            println("no hay descuento")
        }
    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}