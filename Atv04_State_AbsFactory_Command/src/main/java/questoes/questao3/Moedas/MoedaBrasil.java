package questoes.questao3.Moedas;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaBrasil extends Moeda{

    public MoedaBrasil(double valor) {
        super(valor);
    }

    @Override
    String formatValue(double valor) {
        Locale Brasil = new Locale("pt", "BR");
        NumberFormat format = NumberFormat.getCurrencyInstance(Brasil);

        return format.format(valor);
    }
}
