package questoes.questao7;

public class ContatoTelefone {
    private final String nome;
    private final String telefone;

    public ContatoTelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato Telefone: [Nome: " + nome + ", Telefone: " + telefone + "]";
    }
}
