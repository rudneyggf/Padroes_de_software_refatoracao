package questoes.questao7;

public interface Builder<T> {
      void constroiNome(String nome);
     void constroiTelefone(String telefone);
     void constroiEmail(String email);
     void constroiEndereco(String endereco);
     T getResultado();
}
