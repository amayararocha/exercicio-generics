package exercicioFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios<T> {
    private List<T> funcionarios;

    public Funcionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<T> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public boolean contemFuncionario(T funcionario) {
        return funcionarios.contains(funcionario);
    }

    public int tamanho() {
        return funcionarios.size();
    }

    public boolean estaVazia() {
        return funcionarios.isEmpty();
    }
}
