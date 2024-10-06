package Arreglos_Y_Cadenas

fun main (){
    var arrayNumerosarray = intArrayOf(2,4,3,5,5,2,2,1,0,0,3);
    // gorupBy agrupa los elementos de un array si los grupos tienen mas de un elemento
    // se obtinen solo un valor de un grupo de arreglos y estos se devuelven
    val arratDuplicados = arrayNumerosarray.groupBy { it }.filter { it.value.size > 1 }.keys;
    println("elementos duplicados: "+ arratDuplicados);
}