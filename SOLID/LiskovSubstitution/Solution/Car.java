package SOLID.LiskovSubstitution.Solution;

public class Car extends EngineVehicle {
    
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
