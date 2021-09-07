package parte_01._02_logica_e_variaveis;

public class Exercicio01 {

    public static void main(String[] args) {
        int y = 99;
        int z = 11;
        int coringa = 0;

        coringa = y;
        y = z;
        z = coringa;

        System.out.println(y);
        System.out.println(z);

        System.out.println("Í");
    }

}
