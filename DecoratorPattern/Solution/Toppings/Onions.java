package DecoratorPattern.Solution.Toppings;

import DecoratorPattern.Solution.Base.BasePizza;

public class Onions extends ToppingDecorator {

    BasePizza basePizza;

    public Onions(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 20;
    }
    
}
