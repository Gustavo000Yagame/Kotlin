import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)

    println("\n === Calculadora ===")

    println("\n Escolha o primeiro numero : ")
    val numero1 = Scanner.nextDouble()

    println("\n Escolha o segundo numero : ")
    val numero2 = Scanner.nextDouble()

    println("\n === escolha a operação ")
    println("\n = 1 - SOMA ")
    println("\n = 2 - SUBTRACAO ")
    println("\n = 3 - MULTIPLICAO ")
    println("\n = 4 - DIVISAO ")

    print("Opcao: ")
    val opcao = readLine()!!.toInt()

    val resultado = when (opcao) {
        1 -> numero1 + numero2
        2 -> numero1 - numero2
        3 -> numero1 * numero2
        4 -> {
            if (numero2 != 0.0) {
                numero1 / numero2
            } else {
                println("Erro: divisão por zero!")
                return
            }
        }
        else -> {
            println("Opção inválida!")
            return
        }
    }

    println("Resultado: $resultado")
}

