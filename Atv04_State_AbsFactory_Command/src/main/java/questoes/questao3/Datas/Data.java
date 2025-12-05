package questoes.questao3.Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public abstract class Data {
    protected LocalDate data;

    public Data(LocalDate data) {
        this.data = data;
    }

    abstract void showDate();

    protected String configure(Locale locale){
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.LONG)
                .withLocale(locale);

        return formatter.format(data);
    }
}
