package parte_01.conteudo_01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();


        System.out.println("O antecessor do número digitado é:");
        System.out.println(numero - 1);

        // mostrar o antecessor

        scanner.close();


    }

}
