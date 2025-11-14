package questoes.questao5.Sanduiches;

public class SanduicheCGFactory implements SanduicheFactory {

    @Override
    public Sanduiche makeSanduiche() {
        return new SanduicheCG();
    }
}
