package exercicioGame;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository<T extends Personagem> {
    private List<T> personagens;

    public PersonagemRepository() {
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(T personagem) {
        personagens.add(personagem);
    }

    public List<T> listarPersonagens() {
        return personagens;
    }
}

