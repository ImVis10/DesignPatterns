package SOLID.InterfaceSegregation.Problem;

public class Chef implements RestaurantEmployee {

    @Override
    public void washDishes() { // if you see here we're forced to implement washDishes for a chef, when in reality chef does not need it.
        // Not chef's job
    }

    @Override
    public void serveCustomers() {
        // Not chef's job
    }

    @Override
    public void cookFood() {
        System.out.println("Cooking delicious food");
    }
    
}
