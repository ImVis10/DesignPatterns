package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.NormalCarDriveStrategy;

public class Subaru extends Car {
    
    Subaru() {
        super(new NormalCarDriveStrategy());
    }
}
