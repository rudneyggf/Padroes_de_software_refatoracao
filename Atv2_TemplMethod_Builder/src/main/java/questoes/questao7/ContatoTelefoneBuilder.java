package questoes.questao7;

public class ContatoTelefoneBuilder implements Builder {
    private String nome;
    private String telefone;

    @Override
    public void constroiNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void constroiTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void constroiEmail(String email) {}

    @Override
    public void constroiEndereco(String endereco) {}

    @Override
    public ContatoTelefone getResultado() {
        return new ContatoTelefone(nome, telefone);
    }


}
