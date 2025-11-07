package questoes.questao7;

public class ContatoInternet {
    private final String nome;
    private final String email;

    public ContatoInternet(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato Internet: [Nome: " + nome + ", E-mail: " + email + "]";
    }

}
