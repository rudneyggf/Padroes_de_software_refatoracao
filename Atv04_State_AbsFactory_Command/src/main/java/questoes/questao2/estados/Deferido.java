package questoes.questao2.estados;


public class Deferido implements Estado,Avaliado {


    public Estado prazoLegalAtingido() {
        System.out.println("Prazo legal atingido, o processo será fechado...");
        return new Fechado();
    }

    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo foi deferido, impossível realizar tal ação");
    }

    @Override
    public Estado designar() {
        throw new IllegalStateException("O processo foi deferido, impossível realizar tal ação");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo foi deferido, impossível realizar tal ação");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        throw new IllegalStateException("O processo já foi deferido");
    }


}
