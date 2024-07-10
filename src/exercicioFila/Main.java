package exercicioFila;

public class Main {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("Primeiro elemento: " + fila.primeiro());

        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        System.out.println("Fila está vazia? " + fila.estaVazia());

        System.out.println("Desenfileirado: " + fila.desenfileirar());

        System.out.println("Fila está vazia? " + fila.estaVazia());
    }
}

