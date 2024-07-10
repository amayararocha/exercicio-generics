package exercicioSimuladorDeRede;

public class Conexao<T> {
    private Dispositivo<T> origem;
    private Dispositivo<T> destino;

    public Conexao(Dispositivo<T> origem, Dispositivo<T> destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public Dispositivo<T> getOrigem() {
        return origem;
    }

    public Dispositivo<T> getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Conexao{" + "origem=" + origem + ", destino=" + destino + '}';
    }
}
