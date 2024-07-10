package exercicioSimuladorDeRede;

public class Main {
    public static void main(String[] args) {
        SimuladorDeRede<String> simulador = new SimuladorDeRede<>();

        Dispositivo<String> computador1 = new Dispositivo<>("Computador1");
        Dispositivo<String> computador2 = new Dispositivo<>("Computador2");
        Dispositivo<String> roteador = new Dispositivo<>("Roteador");

        simulador.adicionarDispositivo(computador1);
        simulador.adicionarDispositivo(computador2);
        simulador.adicionarDispositivo(roteador);

        Conexao<String> conexao1 = new Conexao<>(computador1, roteador);
        Conexao<String> conexao2 = new Conexao<>(computador2, roteador);

        simulador.adicionarConexao(conexao1);
        simulador.adicionarConexao(conexao2);

        simulador.simular();
    }
}
