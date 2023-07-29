package SOLID.LiskovSubstitution.Problem;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngine().toString()); // will throw NPE as for Bicycle returns NULL for hasEngine() and we're trying to convert NULL to a string, which will result in a NPE
        }
    }

    // We should try to avoid this runtime error
    /** This is what LISKOV SUBSTITUTION  principle says: All the child classes should be able to substitute each other without breaking the code */
}
