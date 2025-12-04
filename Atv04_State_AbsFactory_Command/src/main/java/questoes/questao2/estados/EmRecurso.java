package questoes.questao2.estados;

public class EmRecurso implements Estado {
    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo já foi criado e validado");
    }

    @Override
    public Estado designar() {
        System.out.println("Designando o processo novamente para uma avaliação");
        return new EmAvaliacao();
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo está em recurso e impossibilitado de ser fechado");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        throw new IllegalStateException("O processo foi indeferido e agora está em recurso");
    }
}
