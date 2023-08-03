package CoffeeTable;
public class ModernCoffeeTable implements CoffeeTable {
    
    @Override
    public boolean hasDrawers() {
        return false;
    }

    @Override
    public boolean hasCoffeeCupHolder() {
        return true;
    }
}
