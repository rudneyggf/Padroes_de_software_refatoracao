package questoes.questao11;

public class Chefe implements Empregado{

    private String nome;

    public Chefe(String nome){
        this.nome = nome;
    }

    @Override
    public void depositaNaConta() {
        double valor = this.getSalario() + this.getSalario();
        String valor_formatado = String.format("%.2f", valor);
        System.out.println("O valor "+ valor_formatado + " R$ foi depositado com sucesso na conta do chefe "+ nome);
    }

    @Override
    public double getSalario() {
        return 5000;
    }

    @Override
    public double getExtras() {
        return 1000;
    }
}
