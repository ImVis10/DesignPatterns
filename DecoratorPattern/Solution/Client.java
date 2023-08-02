package DecoratorPattern.Solution;

import DecoratorPattern.Solution.Base.BasePizza;
import DecoratorPattern.Solution.Base.ChickenTikka;
import DecoratorPattern.Solution.Toppings.ExtraCheese;
import DecoratorPattern.Solution.Toppings.GreenCapsicum;
import DecoratorPattern.Solution.Toppings.Onions;

public class Client {

    public static void main(String[] args) {
        
        BasePizza pizza = new GreenCapsicum(new Onions(new ExtraCheese(new ChickenTikka()))); // try any combination
        System.out.println("Cost of the pizza with toppings: " + pizza.getCost());
    }
    
}
