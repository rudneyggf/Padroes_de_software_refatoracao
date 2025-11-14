package questoes.questao6;

import questoes.questao6.Pedidos.Pedido;
import questoes.questao6.Pedidos.PedidoInternacionalFactory;
import questoes.questao6.Pedidos.PedidoNacionalFactory;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoNacionalFactory().createPedido(40);
        Pedido p2 = new PedidoInternacionalFactory().createPedido(56.45);

        p1.processarPedido();
        p2.processarPedido();
    }
}
