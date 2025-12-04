package questoes.questao2.estados;

public class EmAvaliacao  implements Estado{
    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo já foi criado e validado");
    }

    @Override
    public Estado designar() {
        throw new IllegalStateException("O processo já foi desginado para avaliação");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo está sendo avaliado e não é possível o cancelar no momento");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        System.out.println("Avisando interessado...");
        return (Estado) avaliado;
    }
}
