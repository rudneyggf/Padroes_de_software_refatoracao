package questoes.questao6.Pedidos;

public class PedidoInternacional implements Pedido{

    private double valor;

    PedidoInternacional(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculaImposto() {
        return valor * 0.25; // 25% imposto de importação
    }

    @Override
    public double calculaFrete() {
        return 100.0; // frete internacional
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado com cartão internacional.");
    }

}
