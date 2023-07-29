package SOLID.InterfaceSegregation.Problem;

public class Waiter implements RestaurantEmployee {

    @Override
    public void washDishes() { // if you see here we're forced to implement washDishes for a waiter, when in reality waiter does not need it.
        // Not waiter's job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customers");
    }

    @Override
    public void cookFood() {
        // Not waiter's job
    }
    
}
