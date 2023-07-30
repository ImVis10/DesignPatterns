package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.LuxuryCarDriveStrategy;

public class Audi extends Car {
    
    Audi() {
        super(new LuxuryCarDriveStrategy());
    }
}
