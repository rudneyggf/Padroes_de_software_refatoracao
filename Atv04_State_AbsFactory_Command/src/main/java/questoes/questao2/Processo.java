package questoes.questao2;

import questoes.questao2.estados.*;

import java.time.LocalDate;
import java.util.Objects;

public class Processo {
    private Estado estado;
    private LocalDate prazoLegal;

    public Processo(LocalDate prazoLegal){
        this.prazoLegal = prazoLegal;
        estado = new Gestacao();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void validar(){
        estado=estado.validar();
    }

    public void designar(){
        estado=estado.designar();
    }

    public void fechar(){
        estado=estado.cancelar();
    }

    public void deferir(LocalDate prazoLegal){
        estado= estado.realizarDefericao(new Deferido());
    }

    public void indeferir(LocalDate prazoLegal){
        estado.realizarDefericao(new Indeferido());
    }

    public void verificarPrazoLegal() {
        Avaliado estadoDefericao = (Avaliado) estado;
        if(Objects.equals(prazoLegal, LocalDate.now()))
            estado = estadoDefericao.prazoLegalAtingido();
    }
}
