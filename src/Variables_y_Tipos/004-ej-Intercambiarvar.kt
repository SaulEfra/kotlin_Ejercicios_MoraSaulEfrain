package Variables_y_Tipos

fun main (){
    println("ingresa algo");
    var vari1 = readln();
    println("Ingresa otra cosa");
    var vari2 = readln();

    var ejem = vari2;
    vari2 = vari1;
    vari1 = ejem;
    println("el valor de la variable dos es $vari2")
    println("el valor de la variable 1 es: "+vari1)
}