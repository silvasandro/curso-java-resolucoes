package parte_01.conteudo_01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a área do seu retângulo...");
        System.out.println("Digite o valor da base do seu retângulo");

        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura do seu retângulo");

        double altura = scanner.nextDouble();

        System.out.println("A área do seu retângulo é: ");
        System.out.println(base * altura);


        scanner.close();
    }

}
