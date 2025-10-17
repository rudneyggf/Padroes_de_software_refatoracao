package questoes.questao14;

public class EnvioPedido implements Handler{

    @Override
    public void processamento(Pedido pedido) {
        System.out.println("Pedido enviado com sucesso, agradeçemos pela preferência! \n\n");

    }

    @Override
    public void setProximo(Handler handler) {
        throw  new IllegalStateException("Após o envio não é possível mais nenhum processamento do pedido");
    }

}
