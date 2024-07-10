package exercicioGame;

public class Personagem {
    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome='" + nome + '\'' + '}';
    }
}

