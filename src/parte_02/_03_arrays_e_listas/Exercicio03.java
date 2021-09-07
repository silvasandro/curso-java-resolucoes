package parte_02._03_arrays_e_listas;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {


    // Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Integer quantidadeItens;
            do {
                System.out.println("Digite a quantidade de itens que o seu vetor armazenará:");
                quantidadeItens = scanner.nextInt();

                if (quantidadeItens > 20) {
                    System.out.println("Você digitou um valor maior do que o permitido (20)");
                }
            } while (quantidadeItens > 20);

            var numeros = new int[quantidadeItens];

            // prenchimento do array

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º número");
                numeros[i] = scanner.nextInt();
            }

            // System.out.println(Arrays.toString(numeros));

            var stream = Arrays
                    .stream(numeros)
                    .filter(numero -> numero % 2 == 0);


            //System.out.println(stream.count());
            stream.forEach(System.out::println); // TODO verificar como reutilzar streams


        }
    }

}
