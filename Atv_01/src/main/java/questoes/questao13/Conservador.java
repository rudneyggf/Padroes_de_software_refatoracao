package questoes.questao13;

public class Conservador implements InvestimentoStrategy{

    @Override
    public double calculaRetornoInvestimento(double valor) {
        return (0.8/100) * valor;
    }
}
