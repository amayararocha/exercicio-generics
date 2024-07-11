package AnalisadorDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Maçã");
        listaDeStrings.add("Banana");
        listaDeStrings.add("Laranja");

        AnalisadorDeDados<String> analisadorDeStrings = new AnalisadorDeDados<>(listaDeStrings);

        System.out.println("Número de elementos na lista: " + analisadorDeStrings.contarElementos());
        System.out.println("A lista contém 'Banana'? " + analisadorDeStrings.contemElemento("Banana"));
        System.out.println("A lista contém 'Pera'? " + analisadorDeStrings.contemElemento("Pera"));
        System.out.println("Elementos na lista:");
        analisadorDeStrings.imprimirDados();
        System.out.println();

        List<Integer> listaDeInteiros = Arrays.asList(1, 3, 5, 7, 9);

        AnalisadorDeDados<Integer> analisadorDeInteiros = new AnalisadorDeDados<>(listaDeInteiros);

        System.out.println("Número de elementos na lista: " + analisadorDeInteiros.contarElementos());
        System.out.println("A lista contém o número 5? " + analisadorDeInteiros.contemElemento(5));
        System.out.println("A lista contém o número 2? " + analisadorDeInteiros.contemElemento(2));
        System.out.println("Elementos na lista:");
        analisadorDeInteiros.imprimirDados();
    }
}
