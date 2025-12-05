package questoes.questao4;

import questoes.questao4.commands.RoboAction;

import java.util.List;

public class Experimento {
    private List<RoboAction> etapas;

    public Experimento(List<RoboAction> etapas) {
        this.etapas = etapas;
    }

    public void process(){
        for (RoboAction etapa : etapas) {
            etapa.execute();
        }
    }
}
