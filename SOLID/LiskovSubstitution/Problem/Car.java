package SOLID.LiskovSubstitution.Problem;

public class Car extends Vehicle {
    
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
