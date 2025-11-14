package questoes.questao2;

public class ChavesDecorator implements Mensagem{

    private Mensagem mensagem;

    public ChavesDecorator(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String imprime() {
        String mensagemAnterior = mensagem.imprime();
        String mensagem = "{"+mensagemAnterior+"}";
        System.out.println(mensagem);
        return mensagem;
    }
}
