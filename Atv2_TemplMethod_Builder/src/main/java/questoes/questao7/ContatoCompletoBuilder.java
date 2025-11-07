package questoes.questao7;

public class ContatoCompletoBuilder implements Builder {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;


    @Override
    public void constroiNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void constroiTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void constroiEmail(String email) {
        this.email = email;
    }

    @Override
    public void constroiEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public ContatoCompleto getResultado() {
        return new ContatoCompleto(nome, telefone, email, endereco);
    }
}
