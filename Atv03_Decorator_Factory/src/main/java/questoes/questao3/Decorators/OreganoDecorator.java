package questoes.questao3.Decorators;

import questoes.questao3.Pizza;

public class OreganoDecorator extends CondimentDecorator{


    public OreganoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescricao() {
        return "Oregano";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.50;
    }
}
