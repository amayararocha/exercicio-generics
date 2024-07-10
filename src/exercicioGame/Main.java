package exercicioGame;

public class Main {
    public static void main(String[] args) {
        PersonagemRepository<Personagem> repositorio = new PersonagemRepository<>();

        Personagem superman = new Personagem("Superman");
        Personagem lexLuthor = new Personagem("Lex Luthor");
        Personagem robin = new Personagem("Robin");

        repositorio.adicionarPersonagem(superman);
        repositorio.adicionarPersonagem(lexLuthor);
        repositorio.adicionarPersonagem(robin);

        System.out.println("Personagens: " + repositorio.listarPersonagens());
    }
}
