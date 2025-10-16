package questoes.questao12;
import  questoes.questao13.Conta;

import java.util.Calendar;

public class Movimentacao {

    private double valor;
    private Conta conta;
    private Calendar data;
    private Encargo encargo; // composição

    public Movimentacao(double valor, Conta conta, Encargo encargo) {
        this.valor = valor;
        this.conta = conta;
        this.encargo = encargo;
        this.data = Calendar.getInstance();
    }

    public double getEncargos() {
        return encargo.calcularValor(valor);
    }

}
