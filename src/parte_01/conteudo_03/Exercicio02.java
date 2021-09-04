package parte_01.conteudo_03;

import java.util.Scanner;

public class Exercicio02 {


    public static void resolucao1() {
        // Construa um algoritmo usando uma estrutura de repetição que
        // calcule o fatorial de um número.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número que deseja saber o fatorial?");
        int numero = scanner.nextInt();

        long fatorial = 1;

        while (numero > 1) {
            fatorial = fatorial * numero;
            numero = numero - 1;
        }

        System.out.printf("O fatorial é %d", fatorial);

        scanner.close();
    }

    public static void resolucao2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número que deseja saber o fatorial?");
        int numero = scanner.nextInt();

        long fatorial = 1;

        for (; numero > 1; numero --) {
            fatorial = fatorial * numero;
        }

        System.out.printf("O fatorial é %d", fatorial);

        scanner.close();
    }

    public static void resolucao3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número que deseja saber o fatorial?");
        int numero = scanner.nextInt();

        System.out.println(fatorial(numero));

        scanner.close();
    }

    public static int fatorial(int n) {
        System.out.println("Passou por aqui");

        if (n == 0) {
            return 1;
        }

        if (n > 0) {
            return n * fatorial(n - 1);
        }

        return n;
    }

    public static void main(String[] args) {
        Exercicio02.resolucao3();
    }

}
