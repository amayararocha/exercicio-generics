package AnalisadorDeDados;

import java.util.List;

public class AnalisadorDeDados<T> {

    private List<T> dados;

    public AnalisadorDeDados(List<T> dados) {
        this.dados = dados;
    }

    public int contarElementos() {
        return dados.size();
    }

    public boolean contemElemento(T elemento) {
        return dados.contains(elemento);
    }

    public void imprimirDados() {
        for (T item : dados) {
            System.out.println(item);
        }
    }
}
