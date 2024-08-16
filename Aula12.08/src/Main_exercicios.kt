import kotlin.math.pow
import kotlin.math.sqrt

//1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
//mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
//menor ou igual a 10!”, caso este número seja menor ou igual

fun main1(){
    print("Digite um número: ")
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
    print("Digite um número: ")
    var numero1 = readln().toDouble()
    print("Digite mais um número: ")
    var numero2 = readln().toDouble()
    println("Resultado adição: ${numero1 + numero2}")
}

//3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
//variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
//ao usuário que a sequência de números informados é inválida

fun main3(){
    print("Digite um número: ")
    var A = readln().toDouble()
    print("Digite outro número: ")
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
    print("Digite um número: ")
    var numero1 = readln().toDouble()
    print("Digite mais um número: ")
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
    print("Digite um número: ")
    var A = readln().toDouble()
    print("Digite outro número: ")
    var B = readln().toDouble()

    println("$A passou a ser ${B+1}")
    println("$B passou a ser ${A+1}")
}

//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
//Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5

fun main6(){
    print("Digite os graus Celsius: ")
    var Cels = readln().toDouble()
    var Fahr = (9 * Cels + 160) / 5

    println("$Fahr º Fahrenheit")
}

//7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
//este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
//o usuário também deverá ser informado

fun main7(){
    print("Digite um número: ")
    val a = readln().toDouble()

    if (a in 100.0..200.0){
        println("$a está entre 100 e 200")
    }else{
        println("$a não está entre 100 e 200")
    }
}

//8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este
//número seja maior ou igual a 50, outra se ele for menor que 50

fun main8(){
    print("Digite um número: ")
    val a = readln().toDouble()

    when{
        a == 50.0 -> println("$a é igual a 50")
        a < 50.0 -> println("$a é menor que 50")
        a > 50.0 -> println("$a é maior que 50")
    }
}

//9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
//diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
//Caso sejam diferentes, informe que são diferentes e qual número é o maior

fun main9(){
    print("Digite um número: ")
    var a = readln().toDouble()
    print("Digite outro número: ")
    var b = readln().toDouble()

    if(a == b){
        println("Os numero digitados são iguais")
    }else{
        println("Os numero digitados são diferentes")
        when{
            a < b -> println("$b é maior que $a")
            a > b -> println("$a é maior que $b")
        }
    }
}

//10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
//o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
//inválido!”

fun main10(){
    print("Digite um número de 1 a 5: ")
    var num = readln().toDouble()
    when(num){
        1.0 -> println("Você digitou o número: Um")
        2.0 -> println("Você digitou o número: Dois")
        3.0 -> println("Você digitou o número: Três")
        4.0 -> println("Você digitou o número: Quatro")
        5.0 -> println("Você digitou o número: Cinco")
        else -> println("Você digitou um número inválido!")
    }
}

//11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
//ordem crescente

fun main11(){
    print("Digite um número inteiro: ")
    var num1 = readln().toInt()
    print("Digite outro número inteiro: ")
    var num2 = readln().toInt()
    print("Digite mais um número inteiro: ")
    var num3 = readln().toInt()

    if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("Os números devem ser distintos.")
        return
    }
    val lista = listOf(num1, num2, num3).sorted()
    println("Valores em ordem crescente: $lista")
}

//12. Escreva um algoritmo que receba o número do mês e mostre o mês
//correspondente. Valide mês inválido

fun main12(){
    print("Digite um número de mês: ")
    var num = readln().toInt()
    when(num){
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Você digitou um mês inválido!")
    }
}

//13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
//operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
//de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
//mensagem de operador não definido. Tratar erro de divisão por zero

fun main13(){
    print("Digite um número: ")
    var num1 = readln().toDouble()
    print("Digite outro número: ")
    var num2 = readln().toDouble()
    print("Digite o operador: ")
    var op = readln()

    if (num2 == 0.0){
        when (op){
            "+" -> println("a soma deu: ${num1 + num2}")
            "-" -> println("a soma deu: ${num1 - num2}")
            "*" -> println("a soma deu: ${num1 * num2}")
            "/" -> println("divisão por 0 não suportada")
            else -> println("Operador não definido")
        }
    }else{
        when (op){
            "+" -> println("a soma deu: ${num1 + num2}")
            "-" -> println("a soma deu: ${num1 - num2}")
            "*" -> println("a soma deu: ${num1 * num2}")
            "/" -> println("a soma deu: ${num1 / num2}")
            else -> println("Operador não definido")
        }
    }
}

//14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
//Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
//r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo
//que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =
//7, r = 3. Resultado: an = 28

fun main14() {
    // Leitura dos valores
    print("Digite o valor do primeiro termo (a1): ")
    val a1 = readLine()!!.toInt()
    print("Digite o valor de n (posição do termo): ")
    val n = readLine()!!.toInt()
    print("Digite o valor da razão (r): ")
    val r = readLine()!!.toInt()
    // Calcula o n-ésimo termo da PA
    val an = a1 + (n - 1) * r
    // Exibe o resultado
    println("O ${n}-ésimo termo da Progressão Aritmética é: $an")
}

//15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,
//y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz
//(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

fun main15(){
    print("Digite x1: ")
    var x1 = readln().toDouble()
    print("Digite y1: ")
    var y1 = readln().toDouble()
    print("Digite x2: ")
    var x2 = readln().toDouble()
    print("Digite y2: ")
    var y2 = readln().toDouble()

    val distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("A distância entre os pontos P1($x1, $y1) e P2($x2, $y2) é: %.2f".format(distancia))

}

//16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
//aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

fun main16(){
    print("Digite nota 1: ")
    var n1 = readln().toDouble()
    print("Digite nota 2: ")
    var n2 = readln().toDouble()
    print("Digite nota 3: ")
    var n3 = readln().toDouble()

    var m = (n1 + n2 + n3)/3

    println("A média é: $m")
}

//17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a
//cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:
//Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3
//                            peso1 + peso2 + peso3
//Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
//Média ponderada = 8.25

fun main17(){
    print("Digite nota 1: ")
    var n1 = readln().toDouble()
    print("Digite nota 2: ")
    var n2 = readln().toDouble()
    print("Digite nota 3: ")
    var n3 = readln().toDouble()

    print("Digite peso 1: ")
    var p1 = readln().toDouble()
    print("Digite peso 2: ")
    var p2 = readln().toDouble()
    print("Digite peso 3: ")
    var p3 = readln().toDouble()

    var mp = (n1*p1 + n2*p2 + n3*p3)/(p1 + p2 + p3)

    println("A média é: $mp")
}

//18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
//harmônica.
//Média harmônica =
//3
//1 + 1 + 1
//nota1 nota2 nota3
//Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
//Média: 7.37

fun main18(){
    print("Digite nota 1: ")
    var n1 = readln().toDouble()
    print("Digite nota 2: ")
    var n2 = readln().toDouble()
    print("Digite nota 3: ")
    var n3 = readln().toDouble()

    var mh = 3/(1/n1 + 1/n2 + 1/n3)

    println("A média é: $mh")
}

//19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu
//volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;
//Exemplo: raio = 10, altura = 15. Volume = 4710

fun main19(){
    print("Digite a altura do cilindro: ")
    var a = readln().toDouble()
    print("Digite a raio do cilindro: ")
    var r = readln().toDouble()

    var v = 3.14 * (r).pow(2) * a

    println("O volume do cilindro é de: $v")
}

//20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em
//uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são
//fornecidos o tempo em hora e a velocidade média da viagem

fun main20() {
    print("Digite o tempo da viagem em horas: ")
    val t = readln().toDouble()
    print("Digite a velocidade média em km/h: ")
    val vM = readln().toDouble()

    val d = t * vM
    val c = d / 12

    println("A quantidade de litros de combustível necessária para a viagem é: %.2f litros".format(c))
}
