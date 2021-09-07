package parte_02._03_arrays_e_listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio04 {

    // Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

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

            Integer maiorValor = Integer.MIN_VALUE;
            for (var n : numeros) {
                if (n > maiorValor) {
                    maiorValor = n;
                }
            }

            System.out.println("O maior valor usando for é:");
            System.out.println(maiorValor);


            System.out.println("O maior valor usando lambda é:");
            System.out.println(Arrays.stream(numeros).max());


            System.out.println("O maior valor usando collections:");
            var listaDeObjetos = Arrays.stream(numeros).boxed().collect(Collectors.toList());
            System.out.println(Collections.max(listaDeObjetos));

            System.out.println("O maior valor usando ordenação é");
            var numerosClone = numeros.clone();
            Arrays.sort(numerosClone);
            System.out.println(numerosClone[numerosClone.length - 1]);


            // Para mostrar que a ordem do array foi mantida usando o .copy
            System.out.println(Arrays.toString(numeros));


        }
    }
}
