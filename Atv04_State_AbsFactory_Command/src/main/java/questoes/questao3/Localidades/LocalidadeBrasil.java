package questoes.questao3.Localidades;

import questoes.questao3.Datas.Data;
import questoes.questao3.Datas.DataBrasil;
import questoes.questao3.Datas.DataEUA;
import questoes.questao3.Moedas.Moeda;
import questoes.questao3.Moedas.MoedaBrasil;
import questoes.questao3.Moedas.MoedaEUA;

import java.time.LocalDate;

public class LocalidadeBrasil implements LocalidadeAbstractFactory{

    private DataBrasil data;
    private MoedaBrasil moeda;

    public LocalidadeBrasil(LocalDate data, double value) {
        this.data = new DataBrasil(data);
        this.moeda = new MoedaBrasil(value);
    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public Moeda getMoeda() {
        return moeda;
    }
}
