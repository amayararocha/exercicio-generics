package exercicioSimuladorDeRede;

public class Dispositivo<T> {
    private T id;

    public Dispositivo(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "id=" + id + '}';
    }
}
