package SOLID.InterfaceSegregation.Solution;

public class Cleaner implements CleanerInterface {
    
    @Override
    public void washDishes() {
        System.out.println("Cleaning the dishes");
    }
}
