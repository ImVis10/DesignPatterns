package CoffeeTable;
public class EverydayCoffeeTable implements CoffeeTable {
    
    @Override
    public boolean hasDrawers() {
        return true;
    }

    @Override
    public boolean hasCoffeeCupHolder() {
        return false;
    }
}
