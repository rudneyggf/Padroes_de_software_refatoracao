package questoes.questao3.Moedas;

public abstract class Moeda {
    protected double value;

    public Moeda(double valor) {
        this.value = valor;
    }

    public void showValue(){
        String formatedValue = formatValue(value);
        System.out.println(formatedValue);
    };

    abstract String formatValue(double valor);
}
