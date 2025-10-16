package questoes.questao13;

import java.util.Random;

public class Moderado implements InvestimentoStrategy{

    @Override
    public double calculaRetornoInvestimento(double investimento) {
        Random random = new Random();
        double escolhido = random.nextDouble();

        if (escolhido >= 0.5)
            return (2.5/100)* investimento;
        else
            return (0.7/100) * investimento;

    }
}
