package SOLID.InterfaceSegregation.Problem;

/** INTERFACE SEGREGATION STATES: Interfaces should be in such a way that client should not be forced to implement methods that it does not need */
public interface RestaurantEmployee {
    void washDishes(); // cleaner
    void serveCustomers(); // waiter
    void cookFood(); // chef
}
