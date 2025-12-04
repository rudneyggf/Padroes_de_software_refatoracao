package questoes.questao2.estados;


public class Criado implements Estado{
    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo já foi validado e criado");
    }

    @Override
    public Estado designar() {;

        System.out.println("O processo agora está em avaliacao");
        return new EmAvaliacao();

    }

    @Override
    public Estado cancelar() {
        System.out.println("O processo está sendo cancelado");
        return new Fechado();
    }

    @Override
    public Estado realizarDefericao (Avaliado avaliado) {
        throw new IllegalStateException("O estado não foi avaliado para ser deferido ou indeferido");
    }
}
