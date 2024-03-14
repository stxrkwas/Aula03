package collections

// Array

fun main(args: Array<String>){

    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for(item in strings){

        //Imprime os itens do array 'strings' em caixa alta/letra maiúscula.
        println(item.toUpperCase())
    }
}