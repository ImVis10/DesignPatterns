package DecoratorPattern.Solution.Toppings;

import DecoratorPattern.Solution.Base.BasePizza;

public class ExtraCheese extends ToppingDecorator { // Decorator pattern entails both is-a and has-a relationship. Topping decorator 'has a' base pizza and pizza with toppings 'is' still 'a' pizza

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 10;
    }   
}
