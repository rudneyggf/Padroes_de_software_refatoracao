package questoes.questao1.estados;

import questoes.questao1.Pedido;

public class Enviado implements Estado {
    @Override
    public void alterar() {
        throw new IllegalStateException("Não é possivel realizar alterações, pois o pedido já foi enviado");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("Não é possivel cancelar, pois o pedido já foi enviado");
    }

    @Override
    public Estado enviar() {
        throw new IllegalStateException("O pedido já foi enviado");
    }

}
