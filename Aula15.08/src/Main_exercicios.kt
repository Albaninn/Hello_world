//1. Construa um programa que leia em um vetor uma sequência de 5 números digitados
//pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais
//ou superiores à média

fun main1() {
    val num = DoubleArray(5)
    for (i in num.indices) {
        print("Digite o ${i + 1}º número: ")
        num[i] = readln().toDouble()
    }
    val soma = num.sum()
    val media = soma / num.size

    println("A média dos números é: %.2f".format(media))

    for (numero in num) {
        when {
            numero < media -> println("O número $numero é menor que a média")
            numero == media -> println("O número $numero é igual à média")
            else -> println("O número $numero é superior à média")
        }
    }
}

//2. Escreva um algoritmo que leia em um vetor uma sequência finita de números
//digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
//ele é positivo, negativo ou zero

fun main2(){
    print("Digite o tamanho do vetor: ")
    val vetor = readln().toInt()
    val num = DoubleArray(vetor)
    for (i in num.indices) {
        print("Digite o ${i + 1}º número: ")
        num[i] = readln().toDouble()
    }
    for (i in num.indices) {
        val numero = num[i]
        when {
            numero < 0 -> println("O ${i+1}° número é $numero e é negativo")
            numero == 0.0 -> println("O ${i+1}° número é $numero e é igual à zero")
            numero > 0 -> println("O ${i+1}° número é $numero e é positivo")
        }
    }
}

//3. Faça um programa que leia em um vetor uma sequência finita de números digitados
//pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do
//primeiro vetor e depois apresente os valores deste vetor.

fun main3(){
    print("Digite o tamanho do vetor: ")
    val vetor = readln().toInt()
    val num1 = DoubleArray(vetor)
    val num2 = DoubleArray(vetor)

    for (i in num1.indices) {
        print("Digite o ${i + 1}º número: ")
        num1[i] = readln().toDouble()
        num2[i] = 2*num1[i]
    }
    for (i in num2.indices){
        var n = num2[i]
        println("O ${i+1}° número é $n")
    }
}

//4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma
//variável de um número n qualquer, depois mostre na tela o índice dos elementos que
//são inferiores a n.

fun main4(){
    val num = DoubleArray(5)
    for (i in num.indices) {
        print("Digite o ${i + 1}º número: ")
        num[i] = readln().toDouble()
    }
    print("Digite a variável de comparação: ")
    var n = readln().toDouble()
    var numMenor = false
    for (i in num.indices){
        if (num[i] < n){
            println("O número na posição $i (${num[i]}) é menor que $n")
            numMenor = true
        }
    }
    if (!numMenor) {
        println("Nenhum número é menor que $n")
    }
}
//5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
//Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
//que o número n aparece no vetor.

fun main5(){
    val num = DoubleArray(5)
    for (i in num.indices) {
        print("Digite o ${i + 1}º número: ")
        num[i] = readln().toDouble()
    }
    print("Digite a variável de comparação: ")
    var n = readln().toDouble()
    var menor = 0
    for (i in num.indices){
        if (num[i] == n){
            menor ++
        }
    }
    println("$n aparece $menor vez(es) no vetor")
}

//6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor
//com 5 pesos e calcule a média ponderada do aluno.
//Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3
//                          peso1 + peso2 + peso3
//Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

fun main6(){
    val notas = DoubleArray(5)
    for (i in notas.indices) {
        print("Digite a ${i + 1}º nota: ")
        notas[i] = readln().toDouble()
    }
    val pesos = DoubleArray(5)
    for (i in pesos.indices) {
        print("Digite o ${i + 1}º peso: ")
        pesos[i] = readln().toDouble()
    }
    //var mp = (pesos[0]+notas[0]*pesos[1]+notas[1]*pesos[2]+notas[2]*pesos[3]+notas[3]*pesos[4]+notas[4])/(pesos[0]+pesos[1]+pesos[2]+pesos[3]+pesos[4])

    var somaPonderada = 0.0
    var somaPesos = 0.0

    for (i in notas.indices) {
        somaPonderada += notas[i] * pesos[i]
        somaPesos += pesos[i]
    }

    val mp = somaPonderada / somaPesos

    println("A média ponderada é: %.2f".format(mp))
}

//7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles
//são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem
//coincidir.

fun main7(){
    val v1 = DoubleArray(5)
    println("############1°Vetor#############")
    for (i in v1.indices) {
        print("Digite o ${i + 1}º número: ")
        v1[i] = readln().toDouble()
    }
    val v2 = DoubleArray(5)
    println("############2°Vetor#############")
    for (i in v2.indices) {
        print("Digite o ${i + 1}º número: ")
        v2[i] = readln().toDouble()
    }

    var vi = false
    for (i in v1.indices){
        when{
            v1[i]==v2[i] -> vi = true
            else -> vi = false
        }
    }
    if (vi == true){
        println("Os vetores são identicos")
    }else{
        println("Os vetores não são identicos")
    }
}

//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a
//concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos
//de B.

fun main8(){
    val v1 = DoubleArray(5)
    println("############1°Vetor#############")
    for (i in v1.indices) {
        print("Digite o ${i + 1}º número: ")
        v1[i] = readln().toDouble()
    }
    val v2 = DoubleArray(5)
    println("############2°Vetor#############")
    for (i in v2.indices) {
        print("Digite o ${i + 1}º número: ")
        v2[i] = readln().toDouble()
    }

    val v3 = DoubleArray(10)
    for (i in v1.indices) {
        v3[i] = v1[i]
    }
    for (i in v2.indices) {
        v3[i + 5] = v2[i]
    }
    println("############ Vetor Concatenado #############")
    for (i in v3.indices) {
        println("Elemento ${i + 1} de C: ${v3[i]}")
    }
}

//9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
//de acordo com as seguintes regras:
//a. Os elementos das posições pares de C são os elementos das posições pares de A;
//b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

fun main(){
    val v1 = DoubleArray(5)
    println("############1°Vetor#############")
    for (i in v1.indices) {
        print("Digite o ${i + 1}º número: ")
        v1[i] = readln().toDouble()
    }
    val v2 = DoubleArray(5)
    println("############2°Vetor#############")
    for (i in v2.indices) {
        print("Digite o ${i + 1}º número: ")
        v2[i] = readln().toDouble()
    }

    val v3 = DoubleArray(5)

    for (i in v3.indices) {
        if (i % 2 == 0) {
            // Posições pares de C recebem os elementos das posições pares de A
            v3[i] = v1[i]
        } else {
            // Posições ímpares de C recebem os elementos das posições ímpares de B
            v3[i] = v2[i]
        }
    }

    println("############ Vetor Resultante #############")
    for (i in v3.indices) {
        println("Elemento ${i + 1} de C: ${v3[i]}")
    }
}

//10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie
//os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o
//último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim
//por diante.


//11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
//de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +
//8*9 = 140


//12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o
//produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
//6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840


//13. Elabore um algoritmo que receba um número n e retorne um vetor com os n
//primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,
//13, 21}.


//14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
//o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
//apagado ou duplicado. Apresente o vetor atualizado na tela.


//15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
//acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
//um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
//valor lido só poderá ser maior que 5.

