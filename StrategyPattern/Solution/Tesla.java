package StrategyPattern.Solution;

import StrategyPattern.Solution.Startegy.ElectricCarDriveStartegy;

public class Tesla extends Car{
    
    Tesla() {
        super(new ElectricCarDriveStartegy());
    }
}
