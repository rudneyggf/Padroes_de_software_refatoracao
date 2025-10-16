package questoes.questao12;
import  questoes.questao13.Conta;

public class Deposito {
    private Movimentacao movimentacao;
    private String numeroEnvelope;

    public Deposito(double valor, Conta conta, String numeroEnvelope) {
        this.movimentacao = new Movimentacao(valor, conta, new SemEncargo());
        this.numeroEnvelope = numeroEnvelope;
    }

    public double getEncargos() {
        return movimentacao.getEncargos();
    }
}
