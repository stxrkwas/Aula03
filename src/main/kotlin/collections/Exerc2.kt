package collections

// Array

fun main(args: Array<String>){

    val pares = arrayListOf(2, 4, 6)
    val impares = arrayListOf(1, 3, 5)

    //Imprimir 'n' enquanto estiver entre a união dos arrays 'impares' e 'pares'.
    for(n in impares.union(pares).sorted()){
        print("$n ")
    }

}