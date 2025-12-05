package questoes.questao4.commands;

public class RoboGas implements RoboAction{

    private String gas;

    public RoboGas(String gas) {
        this.gas = gas;
    }

    @Override
    public void execute() {
        System.out.println("Aumentando concentração de "+ gas+"...");
    }
}
