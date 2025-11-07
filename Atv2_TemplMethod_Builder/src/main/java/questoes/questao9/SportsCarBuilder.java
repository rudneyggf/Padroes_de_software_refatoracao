package questoes.questao9;

public class SportsCarBuilder extends CarBuilder {

    @Override
    public void buildChassis() {
        System.out.println("Colocando chassis de SportsCarBuilder ");
    }

    @Override
    public void installEngine() {
        System.out.println("Installando motor de SportsCarBuilder");
    }

    @Override
    public void setupFeatures() {
        System.out.println("Configurando features de SportsCarBuilder");
    }
}
