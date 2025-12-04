package questoes.questao1.estados;

import questoes.questao1.Pedido;

public interface Estado {
    void alterar();
    Estado cancelar();
    Estado enviar();
}
