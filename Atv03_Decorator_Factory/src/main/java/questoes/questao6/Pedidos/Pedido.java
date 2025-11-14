package questoes.questao6.Pedidos;

public interface Pedido {
    double calculaImposto();
    double calculaFrete();
    void processarPagamento();

    default void processarPedido() {
        System.out.println("Imposto: " + calculaImposto());
        System.out.println("Frete: " + calculaFrete());
        processarPagamento();
        System.out.println("Pedido processado com sucesso!\n");
    }
}
