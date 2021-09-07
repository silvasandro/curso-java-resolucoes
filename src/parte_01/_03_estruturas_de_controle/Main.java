package parte01.conteudo_02;

public class Main {

    public static void main(String[] args) {
        double i = 59 % 6;
        System.out.println(i);

        System.out.println(1 == 2);


        System.out.println(1 != 1);
        System.out.println(1 != 2);

        System.out.println(!!false);

        if (1 == 2)
            System.out.println("Um é igual a um");

        System.out.println("Teste");


        System.out.printf(
                "Teste com 7 parametros %s %s %s %s %s %s %s",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7"
        );


        System.out.println("");
        System.out.printf("O resultado da adição entre %.2f e %.2f é: %.2f!", 20f, 30f, 50f);


        System.out.println(1 <= 3 && 3 <= 2);


    }

}
