package parte_01.conteudo_02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // 5. Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
        // (adição, subtração, multiplicação e divisão).
        // Todas as operações serão entre dois valores.
        // No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a operação que deseja fazer (a, s, m, d)");
        char operacao = in.next().charAt(0);


        System.out.println("Digite o primeiro valor");
        double valor1 = in.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = in.nextDouble();


        double resultado;
        switch (operacao) {
            case 'a':
                resultado = valor1 + valor2;
                System.out.printf("A soma entre o valor %f + %f é igual: %f", valor1, valor2, resultado);
                break;
            case 's':
                resultado = valor1 - valor2;
                System.out.printf("A subtração entre o valor %f - %f é igual: %f", valor1, valor2, resultado);
                break;
            case 'm':
                resultado = valor1 * valor2;
                System.out.printf("A multiplicação entre o valor %f * %f é igual: %f", valor1, valor2, resultado);
                break;
            case 'd':
                if (valor2 == 0) {
                    System.out.println("Não se pode dividir por 0");
                } else {
                    resultado = valor1 / valor2;
                    System.out.printf("A divisão entre o valor %f / %f é igual: %f", valor1, valor2, resultado);
                }
                break;
            default:
                System.out.println("Opção não disponível");
        }

        in.close();
    }


}
