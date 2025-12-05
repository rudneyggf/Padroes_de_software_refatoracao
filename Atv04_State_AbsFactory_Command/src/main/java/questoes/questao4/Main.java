package questoes.questao4;

import questoes.questao4.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RoboAction> etapas = new ArrayList<RoboAction>();
        etapas.add(new RoboTemperatura());
        etapas.add(new RoboGas("CO2"));
        etapas.add(new RoboQuimico());

        Experimento experimento = new Experimento(etapas);
        experimento.process();

        System.out.println("--------------------------------------||----------------------------------");

        List<RoboAction> etapas2 = new ArrayList<RoboAction>();
        etapas2.add(new RoboTemperatura());
        etapas2.add(new RoboUmidade());
        etapas2.add(new RoboAgitador());

        Experimento experimento2 = new Experimento(etapas2);
        experimento2.process();

    }
}
