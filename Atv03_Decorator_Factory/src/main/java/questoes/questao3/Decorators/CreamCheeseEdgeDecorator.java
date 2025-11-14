package questoes.questao3.Decorators;

import questoes.questao3.Pizza;

public class CreamCheeseEdgeDecorator extends CondimentDecorator{

    public CreamCheeseEdgeDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription() {
        return "Cream Cheese Edge";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost()+ 1.20;
    }
}
