package questoes.questao5.Sanduiches;

public class SanduicheRTFactory implements SanduicheFactory{
    @Override
    public Sanduiche makeSanduiche() {
        return new SanduicheRT();
    }
}
