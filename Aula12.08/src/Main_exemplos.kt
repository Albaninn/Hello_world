//variavel e constante
const val NOME = "Loh"
var nome = "lulu"

//inteiros e decimais
const val valor_1: Int = 100
const val valor_2: Int = 50
const val dec_1: Double = 100.03
const val dec_2: Double = 50.03

var pratos = 100
var copos = 50

fun main(){
    var numero = 20
    if (numero in 1.. 30){
        println("Alunos: $numero")
    }
    numero = readln().toInt()
    when (numero){

        31 -> println("Alunos: $numero")
        in 1..30 -> println("Alunos: $numero")
        else -> println("Não achou correspondencia")
    }
}

fun main_3(){
    println("Informe o número de pratos: ")
    pratos = readln().toInt()
    println("Informe o número de copos: ")
    copos = readLine()!!.toInt()
    if (pratos > copos){
        println("Há mais pratos...")
    }else{
        println("Há mais copos...")
    }
}

fun main_2(){
    println("-------------------Inteiros-------------------")
    println("Resultado adição: ${valor_1 + valor_2}")
    println("Resultado subtração: ${valor_1 - valor_2}")
    println("Resultado multiplicação: ${valor_1 * valor_2}")
    println("Resultado divisão: ${valor_1 / valor_2}")

    val resultado = String.format(".2f",dec_1 / dec_2)
    println("\n-------------------Decimais-------------------")
    println("Resultado adição: ${dec_1 + dec_2}")
    println("Resultado subtração: ${dec_1 - dec_2}")
    println("Resultado multiplicação: ${dec_1 * dec_2}")

    println("\n-------Decimais Formatação--------")
    println("Resultado divisão: $resultado")



}

fun main_1(){
    nome = "Luska"
    println("Variavel: $nome")
    println("Constasnte: ${NOME}")
}