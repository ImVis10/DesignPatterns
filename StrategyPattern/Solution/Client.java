package StrategyPattern.Solution;

public class Client {
    
    public static void main(String[] args) {
        Car car = new Subaru();
        car.drive();
    }
}
