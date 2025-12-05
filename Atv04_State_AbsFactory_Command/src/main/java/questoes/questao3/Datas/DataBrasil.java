package questoes.questao3.Datas;

import java.time.LocalDate;
import java.util.Locale;

public class DataBrasil extends Data{

    public DataBrasil(LocalDate data){
        super(data);
    }

    @Override
    public void showDate() {
        String data = configure(new Locale("pt", "BR"));
        System.out.println(data);
    }
}
