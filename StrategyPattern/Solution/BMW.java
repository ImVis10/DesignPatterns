package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.LuxuryCarDriveStrategy;

public class BMW extends Car {
    
    BMW() {
        super(new LuxuryCarDriveStrategy());
    }
}
