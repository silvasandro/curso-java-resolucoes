package parte_01.conteudo_02;

import java.util.Scanner;

public class Exercicio01 {

    //Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }

        in.close();
    }
}
