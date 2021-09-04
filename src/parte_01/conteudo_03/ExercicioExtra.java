package parte_01.conteudo_03;

import java.util.Scanner;

public class ExercicioExtra {


    public static void banana() {
        /*
        * Escreva um programa em Java que permita a entrada de uma String S e então exiba na
        * tela todas as possíveis rotações à esquerda de S. Por exemplo, se o usuário digitar
        * “Banana”, o programa deve exibir:
        “Banana”
        “ananaB”
        “nanaBa”
        “anaBan”
        “naBana”
        “aBanan”
        “Banana”
         */

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        char usuarioQuerExecutar = 's';

        do {

            System.out.println("Digite a palavra que você quer rotacionar:");
            String str = in.next();


            int tamanhoString = str.length();

            StringBuilder strDeSaida = new StringBuilder();


            for (int i = 0; i < tamanhoString; i++) {
                strDeSaida.append(str.charAt(i));
                for (int j = i + 1; j < tamanhoString + i; j++) {
                    strDeSaida.append(str.charAt(j > tamanhoString - 1 ? j - tamanhoString : j));
                    // If ternário
                }
                strDeSaida.append("\n");

            }
            strDeSaida.append(str);

            System.out.println(strDeSaida);

            System.out.println("Deseja rotacionar mais alguma palavra? [s, n]");
            usuarioQuerExecutar = in.next().charAt(0);


        } while (usuarioQuerExecutar == 's');
        in.close();

    }


    public static void fibonnaci() {
        /*
         * Faça um programa para calcular a série de Fibonacci para um número informado pelo usuário,
         * sendo F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2)  Por exemplo, caso o usuário informe o
         * número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
         * */

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho da série Fibonacci");
        int tamanhoDaSerie = in.nextInt();

        int n1 = 1;
        int n2;
        int fibonacci = 0;


        for (int i = 0; i <= tamanhoDaSerie; i++) {
            n2 = fibonacci;
            fibonacci = n1 + fibonacci;
            n1 = n2;
            System.out.print(n1 + " ");
        }

        in.close();
    }


    public static void main(String[] args) {
        banana();
    }

}
