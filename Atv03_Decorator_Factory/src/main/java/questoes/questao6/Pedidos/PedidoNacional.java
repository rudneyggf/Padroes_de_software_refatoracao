package questoes.questao6.Pedidos;

public class PedidoNacional implements Pedido {

    private double valor;

    PedidoNacional(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculaImposto() {
        return valor * 0.10; // 10% imposto nacional
    }

    @Override
    public double calculaFrete() {
        return 20.0; // frete fixo nacional
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado via boleto.");
    }

}
