package questoes.questao1.estados;

import questoes.questao1.Pedido;

public class Processando implements Estado {
    @Override
    public void alterar() {
        System.out.println("Alterando...");
    }

    @Override
    public Estado cancelar() {
       System.out.println("Cancelando...");
       return new Cancelado();
    }

    @Override
    public  Estado enviar() {
        System.out.println("Enviando...");
        return new Enviado();
    }
}
