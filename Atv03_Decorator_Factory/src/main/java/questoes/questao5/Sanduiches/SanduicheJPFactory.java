package questoes.questao5.Sanduiches;

public class SanduicheJPFactory implements SanduicheFactory {
    @Override
    public Sanduiche makeSanduiche() {
        return new SanduicheJP();
    }
}
