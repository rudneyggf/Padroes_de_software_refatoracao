package questoes.questao14;

public class Item {
    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoQtd(){
        return produto.getPreco() * quantidade;
    }

    public String nomeProduto(){
        return produto.getNome();
    }

    public boolean verificaEstoque(){
        return this.quantidade <= produto.getEstoque();
    }
}
