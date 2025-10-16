package questoes.questao13;

public class RealizadorDeInvestimentos {

    public void Investir(Conta conta, InvestimentoStrategy investimento, double valor) {
        try {
            if (valor > conta.getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente para investir na conta de " + conta.getTitular());

            double lucro = investimento.calculaRetornoInvestimento(valor) * 0.75;
            conta.depositar(lucro);
            System.out.println("Investimento na conta de " + conta.getTitular() + " Realizado com sucesso");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
