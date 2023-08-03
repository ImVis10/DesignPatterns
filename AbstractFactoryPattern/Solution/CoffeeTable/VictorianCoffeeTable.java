package CoffeeTable;
public class VictorianCoffeeTable implements CoffeeTable {
    
    @Override
    public boolean hasDrawers() {
        return false;
    }

    @Override
    public boolean hasCoffeeCupHolder() {
        return false;
    }
}
