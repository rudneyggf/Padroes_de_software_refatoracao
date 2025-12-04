package questoes.questao1;

import questoes.questao1.estados.Estado;
import questoes.questao1.estados.Processando;

public class Pedido {

    private Estado estado;

    public Pedido(){
        estado = new Processando();
    }

    public Estado getEstado() {
        return estado;
    }


    public void alterar(){
        estado.alterar();
    }

    public void cancelar(){
        estado = estado.cancelar();
    }

    public void enviar(){
        estado = estado.enviar();
    }
}
