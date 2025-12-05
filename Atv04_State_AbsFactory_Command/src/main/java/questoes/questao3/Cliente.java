package questoes.questao3;

import questoes.questao3.Datas.DataBrasil;
import questoes.questao3.Datas.DataEUA;
import questoes.questao3.Localidades.Localidade;
import questoes.questao3.Localidades.LocalidadeAbstractFactory;
import questoes.questao3.Moedas.MoedaBrasil;
import questoes.questao3.Moedas.MoedaEUA;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        Factory factory = new Factory(Localidade.EUA);
        LocalDate date = LocalDate.now();
        double value = 24.6;

        LocalidadeAbstractFactory localidadefactory1 = factory.newLocalidade(date, value);
        MoedaEUA coin = (MoedaEUA) localidadefactory1.getMoeda();
        DataEUA dateEUA = (DataEUA) localidadefactory1.getData();

        coin.showValue();
        dateEUA.showDate();
        System.out.println("------------------------------------||-----------------------------");

        double value2 = 10;
        Factory factory2 = new Factory(Localidade.BRASIL);
        LocalidadeAbstractFactory localidadefactory2 = factory2.newLocalidade(date, value2);

        MoedaBrasil moeda = (MoedaBrasil) localidadefactory2.getMoeda();
        DataBrasil dataBrasil = (DataBrasil) localidadefactory2.getData();

        moeda.showValue();
        dataBrasil.showDate();

    }
}
