package questoes.questao3;

import questoes.questao3.Localidades.Localidade;
import questoes.questao3.Localidades.LocalidadeAbstractFactory;
import questoes.questao3.Localidades.LocalidadeBrasil;
import questoes.questao3.Localidades.LocalidadeEUA;

import java.time.LocalDate;

public class Factory {
    private Localidade localidade;

    public Factory(Localidade localidade) {
        this.localidade = localidade;
    }

    public LocalidadeAbstractFactory newLocalidade(LocalDate date,double value) {
            switch (localidade) {
                case BRASIL:
                    return new LocalidadeBrasil(date,value);
                case EUA:
                    return new LocalidadeEUA(date,value);
                default:
                    // Trata um caso não suportado
                    throw new IllegalArgumentException("País não suportado: " + localidade);
        }
    }

}
