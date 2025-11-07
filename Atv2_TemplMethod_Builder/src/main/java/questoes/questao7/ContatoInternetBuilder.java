package questoes.questao7;

public class ContatoInternetBuilder implements Builder{
    private String nome;
    private String email;

    @Override
    public void constroiNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void constroiTelefone(String telefone) {}

    @Override
    public void constroiEmail(String email) {
        this.email = email;
    }

    @Override
    public void constroiEndereco(String endereco) {}

    @Override
    public ContatoInternet getResultado() {
        return new ContatoInternet(nome, email);
    }


}
