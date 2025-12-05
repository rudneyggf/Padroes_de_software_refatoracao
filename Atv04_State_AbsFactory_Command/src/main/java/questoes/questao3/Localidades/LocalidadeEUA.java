package questoes.questao3.Localidades;

import questoes.questao3.Datas.Data;
import questoes.questao3.Datas.DataEUA;
import questoes.questao3.Moedas.Moeda;
import questoes.questao3.Moedas.MoedaEUA;

import java.time.LocalDate;


public class LocalidadeEUA implements LocalidadeAbstractFactory{

    private DataEUA date;
    private MoedaEUA coin;

    public LocalidadeEUA(LocalDate date, double value) {
        this.date = new DataEUA(date);
        this.coin = new MoedaEUA(value);
    }

    @Override
    public Data getData() {
        return date;
    }

    @Override
    public Moeda getMoeda() {
        return coin;
    }
}
