package parte_01.conteudo_02;

import java.util.Scanner;

public class Exercicio03 {
    // Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int primeiroNumero = in.nextInt();

        System.out.println("Digite o 2º número");
        int segundoNumero = in.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os dois números são iguais");
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O primeiro número é menor");
        } else {
            System.out.println("O segundo número é menor");
        }

        in.close();
    }
}
