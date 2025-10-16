package questoes.questao13;

public class Conta {

    private Integer numero;
    private String titular;
    private double saldo;

    public Conta(Integer numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
        else
            throw new IllegalArgumentException("Valor inválido, tente novamente");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
