package questoes.questao2.estados;

public class Fechado implements Estado {

    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo encontra-se fechado");
    }

    @Override
    public Estado designar() {
        throw new IllegalStateException("O processo encontra-se fechado");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo já foi fechado");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        throw new IllegalStateException("O processo encontra-se fechado");
    }
}
