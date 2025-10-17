package questoes.questao14;

public class Produto {
    private Integer codigo;
    private String nome;
    private String descricao;
    private int estoque;
    private double preco;

    public Produto( Integer codigo, String nome, String descricao, int estoque, double preco ) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {}

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
