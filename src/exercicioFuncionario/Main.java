package exercicioFuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionarios<String> empresa = new Funcionarios<>();

        empresa.adicionarFuncionario("Mayara");
        empresa.adicionarFuncionario("Gustavo");
        empresa.adicionarFuncionario("Lucelena");

        System.out.println("Funcionários da empresa: " + empresa.listarFuncionarios());

        System.out.println("A empresa contém 'Mayara'? " + empresa.contemFuncionario("Mayara"));

        empresa.removerFuncionario("Gustavo");
        System.out.println("Funcionários da empresa após remover 'Gustavo': " + empresa.listarFuncionarios());

        System.out.println("Número de funcionários na empresa: " + empresa.tamanho());

        System.out.println("A empresa está sem funcionários? " + empresa.estaVazia());
    }
}
