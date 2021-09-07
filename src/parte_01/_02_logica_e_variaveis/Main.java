package parte01.conteudo01;

public class Main {

    public static void main(String[] args) {
        // Essa estrutura aqui.
        // O que está aqui dentro
        System.out.println("Olá código sem barreiras!");

        boolean meuPrimeiroMentiroso = false;

        char meuPrimeiroChar = 'a';
        String minhaPrimeiraString = "ab";

        byte meuPrimeiroByte = 0; // TODO procurar exemplos com bytes -128 até 127

        short meuPrimeiroShort = 0;

        int meuPrimeiroInt = 2_147_483_647;

        System.out.println(" Valor Min int/Integer ->"+Integer.MIN_VALUE );
        System.out.println(" Valor Max int/Integer ->"+Integer.MAX_VALUE );


        long meuPrimeiroLong = 1L;

        float meuPrimeiroFloat = 0.0f;

        double meuPrimeiroDouble = 0.0;


        System.out.println(1 + 1);
        System.out.println(100 - 99);
        System.out.println(20 * 5);
        System.out.println(20 / 5);

        System.out.println("Texto " + "outra parte do texto");
        System.out.println("Texto" + 1);
        System.out.println(1+10);
    }

}
