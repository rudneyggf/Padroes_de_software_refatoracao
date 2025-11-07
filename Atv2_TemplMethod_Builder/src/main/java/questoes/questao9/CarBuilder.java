package questoes.questao9;

public abstract class CarBuilder {

    public void build() {
            buildChassis();
            installEngine();
            setupFeatures();
    }

    public abstract void buildChassis();
    public abstract void installEngine();
    public abstract void setupFeatures();

}
