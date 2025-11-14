package questoes.questao3.Decorators;

import questoes.questao3.Pizza;

public class TomatoDecorator extends CondimentDecorator{

    public TomatoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription() {
        return "Tomato";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.10;
    }
}
