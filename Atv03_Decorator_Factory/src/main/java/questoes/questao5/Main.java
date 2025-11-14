package questoes.questao5;

import questoes.questao5.Sanduiches.*;

public class Main {
    public static void main(String[] args) {

        Sanduiche sanduiche = new SanduicheCGFactory().makeSanduiche();
        sanduiche.descreverSanduiche();

        Sanduiche sanduiche2 = new SanduicheJPFactory().makeSanduiche();
        sanduiche2.descreverSanduiche();

        Sanduiche sanduiche3 = new SanduicheRTFactory().makeSanduiche();
        sanduiche3.descreverSanduiche();

    }
}
