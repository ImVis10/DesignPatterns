package SOLID.LiskovSubstitution.Solution;

import java.util.ArrayList;
import java.util.List;

/** LISKOV SUBSTITUTION  principle says: All the child classes should be able to substitute each other without breaking the code 
    * More Formal definition: If class B is a subclass of class A, then we should be able to replace object of A with B without breaking the behaviour of the program.
*/

public class Client {
    public static void main(String args[]) {
        
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngine().toString()); // Now we will get a compile time error, so we won't be surprised by the runtime error
        }

        List<EngineVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new MotorCycle());
        engineVehicleList.add(new Car());
        engineVehicleList.add(new Bicycle()); // Now we will get a compile time error, so we won't be surprised by the runtime error

        for (EngineVehicle vehicle : engineVehicleList) {
            System.out.println(vehicle.hasEngine()); 
        }
    }
}
