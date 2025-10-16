package questoes.questao12;

public class EncargoComum implements Encargo {

    @Override
    public double calcularValor(double valor) {
        return 0.1 *valor;
    }
}
