package questoes.questao3.Decorators;

import questoes.questao3.Pizza;

public abstract class CondimentDecorator extends Pizza {
    protected Pizza decoratedPizza;

    public CondimentDecorator(Pizza decoratedPizza) {
        super();
        this.decoratedPizza = decoratedPizza;
    }

    public abstract double cost();
}
