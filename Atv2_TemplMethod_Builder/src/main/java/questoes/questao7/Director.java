package questoes.questao7;

public class Director {

    public <T> T construirContatoInternet(Builder<T> builder, String nome, String email ) {
        builder.constroiNome(nome);
        builder.constroiEmail(email);
        return builder.getResultado();
    }

    public <T> T construirContatoTelefone(Builder<T> builder, String nome, String telefone ) {
        builder.constroiNome(nome);
        builder.constroiTelefone(telefone);
        return builder.getResultado();
    }

    public <T> T construirContatoCompletp(Builder<T> builder, String nome, String telefone,
                                          String email, String endereco ) {
        builder.constroiNome(nome);
        builder.constroiTelefone(telefone);
        builder.constroiEmail(email);
        builder.constroiEndereco(endereco);
        return builder.getResultado();
    }
}
