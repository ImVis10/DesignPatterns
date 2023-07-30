package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.ElectricCarDriveStartegy;

public class Rivian extends Car {
    
    Rivian() {
        super(new ElectricCarDriveStartegy());
    }
}
