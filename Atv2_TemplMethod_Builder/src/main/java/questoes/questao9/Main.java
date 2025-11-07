package questoes.questao9;

public class Main {
    public static void main(String[] args) {
        SedanBuilder sedanBuilder = new SedanBuilder();
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        SUVBuilder suvBuilder = new SUVBuilder();
        System.out.println("------Sedan-----------");
        sedanBuilder.build();
        System.out.println();
        System.out.println("------SportsCar-----------");
        sportsCarBuilder.build();
        System.out.println();
        System.out.println("------SUV-----------");
        suvBuilder.build();
    }
}
