package Bucles

fun main(){
    try {
        println("ingresa un numero")
        var num = readln().toInt();
        var cont: Int = num
        // si se decea saber el numero de numeros pares que hay entre un numero dado y 1
        // debe existir u contador que valga lo mismo que el numero dado y que cuando llegue
        // a cero ya no se cumpla la condicion
        // en cada ciclo a el numero se le resta uno al igual que el contador
        // si el reciduo de la divicion del numero entre 2 es igual a cero entonces quiere
        // decir que el numero es par y por lo tanto se imprime imprime ese valor
        while (cont > 1){
            var res = num % 2;
            if ( res == 0){
                println("numero par: ${num}")
            }
            cont--
            num--
        }
    }catch(e:NumberFormatException){
        println("ingresa un valor valido")
    }
}