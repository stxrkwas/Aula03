package collections

// Array de diversas variáveis

fun main(args: Array<String>){

    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    // Enquanto um item estiver no array listaMix:
    for(item in listaMix){

        //Se o item for uma string, imprimir o item em caixa alta.
        if(item is String){
            println(item.toUpperCase())
        }

        //Se não estiver, imprimir os outros itens.
        else{
            println(item)
        }

    }

}