package questoes.questao2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            LocalDate today = LocalDate.now();
            LocalDate dataFutura = today.plusDays(3);

            Processo p = new Processo(dataFutura);
            p.validar();
            p.designar();
            p.deferir(today);
            p.verificarPrazoLegal();
            System.out.println(p.getEstado());

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
