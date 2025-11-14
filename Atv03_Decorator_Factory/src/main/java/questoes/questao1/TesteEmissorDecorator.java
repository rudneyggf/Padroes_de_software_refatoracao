package questoes.questao1;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        String mensagem = "Silly Message";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.enviar(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.enviar(mensagem);

        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia( new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.enviar(mensagem);
    }
}
