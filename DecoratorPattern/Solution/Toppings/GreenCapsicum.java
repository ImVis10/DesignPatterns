package DecoratorPattern.Solution.Toppings;

import DecoratorPattern.Solution.Base.BasePizza;

public class GreenCapsicum extends ToppingDecorator {

    BasePizza basePizza;

    public GreenCapsicum(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 25;
    }
    
}
