package questoes.questao11;

public class Funcionario implements Empregado{

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void depositaNaConta() {
        double valor = this.getSalario() + this.getExtras();
        String valor_formatado = String.format("%.2f", valor);
        System.out.println("O valor "+ valor_formatado + " R$ foi depositado com sucesso na conta do funcionario "+ nome);
    }

    @Override
    public double getSalario() {
        return 2000;
    }

    @Override
    public double getExtras() {
        return 400;
    }
}
