package questoes.questao13;

public class Main {
    public static void main(String[] args) {
            RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

            Conservador conservador = new Conservador();
            Moderado moderado = new Moderado();
            Arrojado arrojado = new Arrojado();

            Conta c1 = new Conta(1,"Arnaldo", 1000);
            Conta c2 = new Conta(2,"Bruno", 600);
            Conta c3 = new Conta(3,"Bruno", 1400);

            realizadorDeInvestimentos.Investir(c1,conservador,1001);
            realizadorDeInvestimentos.Investir(c2,moderado,300);
            realizadorDeInvestimentos.Investir(c3,arrojado,700);

            System.out.println(c1.getSaldo());
            System.out.println(c2.getSaldo());
            System.out.println(c3.getSaldo());

    }
}
