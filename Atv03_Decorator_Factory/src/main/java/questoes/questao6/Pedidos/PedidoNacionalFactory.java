package questoes.questao6.Pedidos;

public class PedidoNacionalFactory implements PedidoFactory{
    @Override
    public Pedido createPedido(double valor) {
        return new PedidoNacional(valor);
    }
}
