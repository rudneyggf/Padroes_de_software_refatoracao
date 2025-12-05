package questoes.questao3.Datas;

import java.time.LocalDate;
import java.util.Locale;

public class DataEUA extends Data{

    public DataEUA(LocalDate date) {
        super(date);
    }

    @Override
    public void showDate() {
        String date = configure(Locale.US);
        System.out.println(date);
    }
}
