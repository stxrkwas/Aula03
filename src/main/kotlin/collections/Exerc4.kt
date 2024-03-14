package collections

// Array - união

fun main(args: Array<String>){

    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + strings

    //Enquanto um item estiver na variável que une os arrays 'numeros' e 'strings', imprimir o item.
    for(item in uniao){
        println(item)
    }

}