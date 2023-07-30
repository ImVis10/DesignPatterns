package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.DriveStrategy;

public class Car {
    
    DriveStrategy ds; // hold just a reference to root strategy object, don't actually create the object so that it remains dynamic

    public Car(DriveStrategy ds) { // contructor injection
        this.ds = ds;
    }

    public void drive() {
        ds.drive();
    }
}
