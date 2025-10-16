package questoes.questao12;
import  questoes.questao13.Conta;

public class Pagamento {
    private Movimentacao movimentacao;
    private String favorecido;
    private String formaDePagamento;

    public Pagamento(double valor, Conta conta, String favorecido, String formaDePagamento) {
        this.movimentacao = new Movimentacao(valor, conta, new EncargoComum());
        this.favorecido = favorecido;
        this.formaDePagamento = formaDePagamento;
    }

    public double getEncargos() {
        return movimentacao.getEncargos();
    }

}
