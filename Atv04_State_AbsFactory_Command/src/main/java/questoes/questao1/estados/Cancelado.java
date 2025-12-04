package questoes.questao1.estados;

import questoes.questao1.Pedido;

public class Cancelado implements Estado {
    @Override
    public void alterar() {
        throw new IllegalStateException("Não é possivel realizar alterações pois o pedido foi cancelado");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O pedido já foi cancelado");
    }

    @Override
    public Estado enviar() {
        throw new IllegalStateException("Não é possivel enviar, o pedido foi cancelado");
    }
}
