package parte_01.conteudo_01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // Escreva um algoritmo para ler o número total de eleitores de um município,
        // o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
        // que cada um representa em relação ao total de eleitores..

        Scanner in = new Scanner(System.in);


        System.out.println("Digite o número de eleitores da comarca");
        int numeroDeEleitores = in.nextInt();

        System.out.println("Digite o número total de votos válidos");
        int totalVotosValidos = in.nextInt();

        System.out.println("Digite o número total de votos brancos");
        int totalVotosBrancos = in.nextInt();

        System.out.println("Digite o número total de votos nulos");
        int totalVotosNulos = in.nextInt();


        System.out.printf("O percentual de votos válidos é: %.2f%%%n", totalVotosValidos * 100f / numeroDeEleitores);

        float percentualVotosNulos = totalVotosNulos * 100f / numeroDeEleitores;

        System.out.println(String.format("O percentual de votos nulos é: %.2f%%", percentualVotosNulos));

        float percentualVotosBrancos = totalVotosBrancos * 100f / numeroDeEleitores;

        System.out.printf("O percentual de votos brancos é: %.2f%%%n", percentualVotosBrancos);


        in.close();

    }

}
