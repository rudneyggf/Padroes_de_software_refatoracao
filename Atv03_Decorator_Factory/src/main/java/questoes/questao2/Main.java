package questoes.questao2;

public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = new NumeroUm();

        System.out.println("Início das etapas Mensagem 1");
        mensagem = new ParentesesDecorator(mensagem);
        mensagem = new CocheteDecorator(mensagem);
        mensagem = new ChavesDecorator(mensagem);
        mensagem.imprime();


        System.out.println("\nInício das etapas Mensagem 2");
        Mensagem mensagem2 = new NumeroUm();
        mensagem2 =new CocheteDecorator(mensagem2);
        mensagem2 = new ChavesDecorator(mensagem2);
        mensagem2 = new ParentesesDecorator(mensagem2);
        mensagem2.imprime();
    }
}
