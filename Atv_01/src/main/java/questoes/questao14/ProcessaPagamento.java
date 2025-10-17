package questoes.questao14;

public class ProcessaPagamento implements Handler{

    private Handler proximo;

    @Override
    public void processamento(Pedido pedido) {

        System.out.println("Processando pagamento do pedido de código " +pedido.getCodigo()+" ...");
        String precoFormatado = String.format("%.2f",pedido.getPrecoTotal());
        System.out.println("O pedido custou "+ precoFormatado+" R$");

        proximo.processamento(pedido);
    }

    @Override
    public void setProximo(Handler handler) {
         this.proximo = handler;
    }
}
