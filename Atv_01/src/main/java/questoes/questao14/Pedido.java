package questoes.questao14;

import java.util.List;

public class Pedido {
    private Integer codigo;
    private List<Item> itens;
    double precoTotal;


    public Pedido( Integer codigo, List<Item> itens ) {
        this.codigo = codigo;
        this.itens = itens;
        this.precoTotal = calculaPrecoTotal();
    }

    public Integer getCodigo() {
        return codigo;
    }


    public double getPrecoTotal() {
        return precoTotal;
    }

    private double calculaPrecoTotal() {
        double precoTotal = 0;
        for (Item item : itens) {
            precoTotal+= item.getPrecoQtd();
        }
        return precoTotal;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void descontarPreco(double porcentagem){
        precoTotal = precoTotal * (1 - porcentagem);
    }

}
