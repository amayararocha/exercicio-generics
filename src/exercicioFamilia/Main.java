package exercicioFamilia;

public class Main {
    public static void main(String[] args) {
        Familia<String> familia = new Familia<>();

        familia.adicionarMembro("Pai");
        familia.adicionarMembro("Mãe");
        familia.adicionarMembro("Filho");

        System.out.println("Membros da família: " + familia.listarMembros());

        System.out.println("A família contém 'Mãe'? " + familia.contemMembro("Mãe"));

        familia.removerMembro("Filho");
        System.out.println("Membros da família após remover 'Filho': " + familia.listarMembros());

        System.out.println("Número de membros na família: " + familia.tamanho());

        System.out.println("A família está vazia? " + familia.estaVazia());
    }
}
