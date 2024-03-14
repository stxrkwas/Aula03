package lambdas

// readLine()

//Função que recebe os valores inseridos nas variáveis e os multiplica
fun multiplica(x: Int, y: Int): Int{
    return x * y
}
fun main(args: Array<String>){

    println("Digite o primeiro número: ")
    val X = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X, Y)

    println("O resultado da multiplicação é = $resultado")

}
