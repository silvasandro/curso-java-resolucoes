package parte_01.conteudo_03;

public class Main {


    public static void main(String[] args) {
        int contagem = 11;


        while (contagem <= 10) {
            System.out.println(contagem);
            contagem = contagem + 1;
        }

        do {
            System.out.println(contagem);
        } while (contagem <= 10);

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }


}
