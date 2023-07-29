package SOLID.InterfaceSegregation.Solution;

public class Waiter implements WaiterInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customers");
    }
    
}
