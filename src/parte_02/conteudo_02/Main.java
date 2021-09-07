package parte_02.conteudo_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] diasDaSemanas = {1, 2, 3, 4, 5, 6, 7};


        // diasDaSemanas[6] = 999; // Trocando o valor do array manualmente na posição 6

        // Iterar sobre arrays
        System.out.println("Enhanced for ou for each");
        for (int dia : diasDaSemanas) {
            System.out.println(dia);
        }

        System.out.println("For padrão");
        for (int i = 0; i < diasDaSemanas.length; i++) {
            System.out.println(diasDaSemanas[i]);
        }

        // Nao precisa se preocupar com isso agora...
        System.out.println("For com lambda");
        Arrays.stream(diasDaSemanas)
                //.filter(diaSemana -> diaSemana % 2 == 0) // Se quiser filtrar somente pares, remova os comentários desta linha
                .forEach(System.out::println);


        System.out.println("-----------------------------------");


        int[] arrayDeInt = {1, 2, 3, 4, 5};

        for (int i : arrayDeInt) {
            i = 5;
            System.out.println(i);
        }

        for (int i : arrayDeInt) {
            System.out.println(i);
        }

        String[] arrayDeString = {"asd", "qwert"};


        System.out.println("------------------------");

        for (String s : arrayDeString) {
            s = "ttt";
            System.out.println(s);
        }


        for (String s : arrayDeString) {
            System.out.println(s);
        }


        for (int i = 0; i < arrayDeInt.length; i++) {
            arrayDeInt[i] = 999;
            System.out.println(arrayDeInt[i]);
        }

        for (int i = 0; i < arrayDeInt.length; i++) {
            System.out.println(arrayDeInt[i]);
        }


        System.out.println("Imprimir array sem for");
        System.out.println(Arrays.toString(arrayDeInt));


        System.out.println(" ---------------- ");
        System.out.println("Alterando o conteúdo de um objeto com o loop foreach");

        Teste[] arrayDeTeste = {new Teste(1), new Teste(2), new Teste(3)};

        for (Teste t : arrayDeTeste) {
            // t.teste = 9; // Alteração do valor da referencia do objeto
            t = new Teste(9); // Alterando a cópia de t do escopo local do for, isso não afetou o array original
            System.out.println(t);
        }

        for (Teste t : arrayDeTeste) {
            System.out.println(t);
        }


        System.out.println("Array List");
        var minhaListaDeInteiros = new ArrayList<Integer>();

        for (int i = 0; i < 100_000; i++) {
            minhaListaDeInteiros.add(i);
        }

        minhaListaDeInteiros.forEach(System.out::println);

        for (Integer item : minhaListaDeInteiros) {
            System.out.println(item);
        }

        // Wrappers
        // int = Integer
        // char = Character
        // long = Long
        // float = Float
        // byte = Byte
        // double = Double
        // short = Short
        // boolean = Boolean

        ArrayList<Object> cabeQualquerCoisa;

        var variavelSoTipoStringInferidaAutomaticamente = "";


    }

}
