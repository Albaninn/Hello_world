//1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
//mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
//menor ou igual a 10!”, caso este número seja menor ou igual

fun main1(){
    println("Digite um número: ")
    var numero = readln().toDouble()
    when {
        numero == 10.0 -> println("Seu número é igual a 10")
        numero < 10.0 -> println("Seu número é menor a 10")
        numero > 10.0 -> println("Seu número é maior a 10")

    }
}

//2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
//resultado da sua soma

fun main2(){
    println("Digite um número: ")
    var numero1 = readln().toDouble()
    println("Digite mais um número: ")
    var numero2 = readln().toDouble()
    println("Resultado adição: ${numero1 + numero2}")
}

//3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
//variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
//ao usuário que a sequência de números informados é inválida

fun main3(){
    println("Digite um número: ")
    var A = readln().toDouble()
    println("Digite outro número: ")
    var B = readln().toDouble()

    when{
        A == B -> println("Sequencia de números inválidos")
        A < B -> println("$B é maior que $A")
        B < A -> println("$A é maior que $B")
    }

}

//4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
//multiplicação e a divisão dos números lidos

fun main4(){
    println("Digite um número: ")
    var numero1 = readln().toDouble()
    println("Digite mais um número: ")
    var numero2 = readln().toDouble()

    println("Resultado soma: ${numero1 + numero2}")
    println("Resultado subtração: ${numero1 - numero2}")
    println("Resultado multiplicação: ${numero1 * numero2}")
    println("Resultado divisão: ${numero1 / numero2}")
}

//5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
//da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
//valor da variável A. Apresentar uma mensagem com o valor original de cada variável
//e outra com os valores trocados

fun main5(){
    println("Digite um número: ")
    var A = readln().toDouble()
    println("Digite outro número: ")
    var B = readln().toDouble()

    println("$A passou a ser ${B+1}")
    println("$B passou a ser ${A+1}")
}

//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
//Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5

fun main6(){
    println("Digite os graus Celsius: ")
    var Cels = readln().toDouble()
    var Fahr = (9 * Cels + 160) / 5

    println("$Fahr º Fahrenheit")
}