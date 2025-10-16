package questoes.questao13;

import java.util.Random;

public class Arrojado implements InvestimentoStrategy{

    @Override
    public double calculaRetornoInvestimento(double investimento) {
        Random random = new Random();
        double escolhido = random.nextDouble();

        if (escolhido <= 0.2)
            return (5.0/100) * investimento;
        else if (escolhido <= 0.5)
            return (3.0/100) * investimento;
        else
            return (0.6/100) * investimento;
    }
}
