package questoes.questao3.Moedas;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaEUA extends Moeda{
    public MoedaEUA(double value) {
        super(value);
    }

    @Override
    String formatValue(double valor) {
        Locale EUA= Locale.US;
        NumberFormat format = NumberFormat.getCurrencyInstance(EUA);

        return format.format(valor);
    }
}
