package parte_02._03_arrays_e_listas;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {

    // Escreva um algoritmo que leia números, insira em um array
    // e após mostre a quantidade de números negativos.

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;
            var indice = 0;

            var numeros = new Integer[10];

            // Para mostrar que quando inicializamos um array, todos os valores dele são o padrão daquele tipo
            // No caso de objeto, o padrão é null, no caso de um int (primitivo) o padrão é 0.
            System.out.println(Arrays.toString(numeros));

            while (programaDeveContinuarExecutando && indice < 10) {
                System.out.println("Digite um novo número");
                numeros[indice] = in.nextInt();

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;
                }
                indice++;
            }

            int quantidade = 0;
            for (Integer item : numeros) {
                if (item != null && item < 0) {
                    quantidade++;
                    System.out.print(item + " ");
                }
            }
            System.out.println("");

            System.out.println("quantidade de itens com valor negativo = " + quantidade);
        }
    }
}
