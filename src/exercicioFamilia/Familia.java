package exercicioFamilia;

import java.util.ArrayList;
import java.util.List;

public class Familia<T> {
    private List<T> membros;

    public Familia() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(T membro) {
        membros.add(membro);
    }

    public void removerMembro(T membro) {
        membros.remove(membro);
    }

    public List<T> listarMembros() {
        return new ArrayList<>(membros);
    }

    public boolean contemMembro(T membro) {
        return membros.contains(membro);
    }

    public int tamanho() {
        return membros.size();
    }

    public boolean estaVazia() {
        return membros.isEmpty();
    }
}