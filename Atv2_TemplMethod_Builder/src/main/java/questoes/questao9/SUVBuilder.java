package questoes.questao9;

public class SUVBuilder extends CarBuilder {

    @Override
    public void buildChassis() {
        System.out.println("Colocando chassis de SUV");
    }

    @Override
    public void installEngine() {
        System.out.println("Installando motor de SUV");
    }

    @Override
    public void setupFeatures() {
        System.out.println("Configurando features de SUV");
    }
}
