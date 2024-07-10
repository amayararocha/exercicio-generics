package exercicioSimuladorDeRede;

import java.util.ArrayList;
import java.util.List;

public class SimuladorDeRede<T> {
    private List<Dispositivo<T>> dispositivos;
    private List<Conexao<T>> conexoes;

    public SimuladorDeRede() {
        this.dispositivos = new ArrayList<>();
        this.conexoes = new ArrayList<>();
    }

    public void adicionarDispositivo(Dispositivo<T> dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void adicionarConexao(Conexao<T> conexao) {
        conexoes.add(conexao);
    }

    public void simular() {
        System.out.println("Simulando rede com os seguintes dispositivos:");
        dispositivos.forEach(System.out::println);

        System.out.println("\nE as seguintes conexões:");
        conexoes.forEach(System.out::println);
    }
}
