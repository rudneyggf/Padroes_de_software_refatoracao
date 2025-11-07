package questoes.questao7;

public class Client {
    public static void main(String[] args) {
        String nome = "Maria da Silva";
        String endereco = "Rua X, 123";
        String telefone = "99 91234-5678";
        String email = "maria@exemplo.com";

        Director director = new Director();

        ContatoInternetBuilder builderInternet = new ContatoInternetBuilder();
        ContatoTelefoneBuilder builderTelefone = new ContatoTelefoneBuilder();
        ContatoCompletoBuilder builderCompleto = new ContatoCompletoBuilder();

        System.out.println("--- Início da Construção de Contatos ---");


        ContatoInternet contatoI = (ContatoInternet) director.construirContatoInternet(builderInternet,nome,email);
        System.out.println("Resultado do Builder Internet:");
        System.out.println(contatoI.toString());
        System.out.println();


        ContatoTelefone contatoII = (ContatoTelefone) director.construirContatoTelefone(builderTelefone,nome,telefone);

        System.out.println("Resultado do Builder Telefone:");
        System.out.println(contatoII.toString());
        System.out.println();


        ContatoCompleto contatoIII = (ContatoCompleto) director.construirContatoCompletp(builderCompleto,nome,telefone,email,endereco);
        System.out.println("Resultado do Builder Completo:");
        System.out.println(contatoIII.toString());


        System.out.println("--- Fim da Construção de Contatos ---");
    }
}
