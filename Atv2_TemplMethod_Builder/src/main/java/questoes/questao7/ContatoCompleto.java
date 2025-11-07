package questoes.questao7;

public class ContatoCompleto {
    private final String nome;
    private final String endereco;
    private final String telefone;
    private final String email;

    public ContatoCompleto(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato Completo: [Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone + ", E-mail: " + email + "]";
    }
}
