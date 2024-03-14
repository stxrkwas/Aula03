package collections

//Array list com objetos
data class Frutas(var nome: String, var preco: Double)

fun main(args: Array<String>){

    var frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Morango", 3.20))

    // Enquanto o item 'fruta' estiver no array 'frutas', imprimir o nome da fruta e o seu preço.
    for(fruta in frutas){
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
}