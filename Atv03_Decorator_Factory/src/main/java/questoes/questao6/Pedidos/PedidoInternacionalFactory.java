package questoes.questao6.Pedidos;

public class PedidoInternacionalFactory implements PedidoFactory {
    @Override
    public Pedido createPedido(double valor) {
        return new PedidoInternacional(valor);
    }
}
