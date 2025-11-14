package questoes.questao3;

import questoes.questao3.Decorators.BaconDecorator;
import questoes.questao3.Decorators.CreamCheeseEdgeDecorator;
import questoes.questao3.Decorators.OreganoDecorator;
import questoes.questao3.Decorators.TomatoDecorator;

public class Pizzaiolo {
    public static void main(String[] args) {
        System.out.println("Pizza --- Valor");

        Pizza p1 = new Mozzarella();
        System.out.printf("%s --- %.1f%n", p1.getDescription(), p1.cost());

        Pizza p2 = new TomatoDecorator(new Mozzarella());
        System.out.printf("%s --- %.1f%n", p2.getDescription(), p2.cost());

        Pizza p3 = new CreamCheeseEdgeDecorator(new TomatoDecorator(new Mozzarella()));
        System.out.printf("%s --- %.1f%n", p3.getDescription(), p3.cost());

        Pizza p4 = new Pepperoni();
        System.out.printf("%s --- %.1f%n", p4.getDescription(), p4.cost());

        Pizza p5 = new BaconDecorator(new OreganoDecorator(new Pepperoni()));
        System.out.printf("%s --- %.1f%n", p5.getDescription(), p5.cost());

        Pizza p6 = new TomatoDecorator(new BaconDecorator(new OreganoDecorator(new Pepperoni())));
        System.out.printf("%s --- %.1f%n", p6.getDescription(), p6.cost());
    }
}
