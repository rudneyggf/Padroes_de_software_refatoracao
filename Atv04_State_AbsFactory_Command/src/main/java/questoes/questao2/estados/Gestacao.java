package questoes.questao2.estados;

public class Gestacao implements Estado {

    @Override
    public Estado validar() {
        System.out.println("Validando Gestacao");
        return new Criado();
    }

    @Override
    public Estado designar() {
        throw new IllegalStateException("O processo ainda não foi criado para ser designado");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo ainda não foi criado para ser fechado");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        throw new IllegalStateException("O processo ainda não foi criado para a deferição ocorrer");
    }
}
