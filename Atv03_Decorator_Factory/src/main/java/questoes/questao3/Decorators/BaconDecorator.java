package questoes.questao3.Decorators;

import questoes.questao3.Pizza;

public class BaconDecorator extends CondimentDecorator {


    public BaconDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription() {
        return "Bacon";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost()+0.80;
    }
}
