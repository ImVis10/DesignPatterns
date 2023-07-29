package SOLID.InterfaceSegregation.Problem;

public class Cleaner implements RestaurantEmployee {

    @Override
    public void washDishes() {
        System.out.println("Cleaning the dishes");
    }

    @Override
    public void serveCustomers() { // if you see here we're forced to implement serveCustomers for a cleaner, when in reality cleaner does not need it.
        // Not cleaner's job
    }

    @Override
    public void cookFood() {
        // Not cleaner's job
    }
    
}
