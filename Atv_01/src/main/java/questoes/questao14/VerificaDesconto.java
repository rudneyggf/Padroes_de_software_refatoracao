package questoes.questao14;

public class VerificaDesconto implements Handler{

    private Handler proximo;

    @Override
    public void processamento(Pedido pedido) {

        if(pedido.getPrecoTotal()>2000 && pedido.getPrecoTotal()<=4000)
            pedido.descontarPreco(0.1);
        else if(pedido.getPrecoTotal()>4000)
            pedido.descontarPreco(0.2);

        System.out.println("Verificação de desconto concluída");

        proximo.processamento(pedido);
    }

    @Override
    public void setProximo(Handler handler) {
         proximo = handler;
    }


}
