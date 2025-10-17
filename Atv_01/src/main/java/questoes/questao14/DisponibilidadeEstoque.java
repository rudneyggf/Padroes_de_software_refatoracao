package questoes.questao14;

import java.util.List;

public class DisponibilidadeEstoque implements Handler{

    private Handler proximo;

    @Override
    public void processamento(Pedido pedido) {
       try {
           List<Item> itens = pedido.getItens();
           for (Item item : itens) {
               if(!item.verificaEstoque())
                   throw new IllegalArgumentException("Não temos estoque suficiente de " +item.nomeProduto());
           }
           System.out.println("\nVerificação de estoque concluída.");

           proximo.processamento(pedido);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    @Override
    public void setProximo(Handler handler) {
        this.proximo = handler;
    }
}
