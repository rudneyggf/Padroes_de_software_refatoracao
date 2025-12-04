package questoes.questao2.estados;



public class Indeferido implements Estado,Avaliado{



    public Estado prazoLegalAtingido() {
        System.out.println("Prazo legal atingido, o processo será fechado...");
        return new Fechado();
    }

    public Estado revisar(){
        System.out.println("O processo agora irá entrar em recurso");
        return new EmRecurso();
    }


    @Override
    public Estado validar() {
        throw new IllegalStateException("O processo foi indeferido, impossível realizar tal ação");
    }

    @Override
    public Estado designar() {
        throw new IllegalStateException("O processo foi indeferido, impossível realizar tal ação");
    }

    @Override
    public Estado cancelar() {
        throw new IllegalStateException("O processo foi indeferido, impossível realizar tal ação");
    }

    @Override
    public Estado realizarDefericao(Avaliado avaliado) {
        throw new IllegalStateException("O processo já foi indeferido");
    }

}
