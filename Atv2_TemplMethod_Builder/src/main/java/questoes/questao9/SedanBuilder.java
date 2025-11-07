package questoes.questao9;

public class SedanBuilder extends CarBuilder {

    @Override
    public void buildChassis() {
        System.out.println("Colocando chassis de Sedan");
    }

    @Override
    public void installEngine() {
        System.out.println("Installando motor de Sedan");
    }

    @Override
    public void setupFeatures() {
        System.out.println("Configurando features de Sedan");
    }
}
