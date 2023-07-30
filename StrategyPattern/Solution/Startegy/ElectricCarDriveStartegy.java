package StrategyPattern.Solution.Startegy;

import StrategyPattern.Constants.Constants;

public class ElectricCarDriveStartegy implements DriveStrategy {
    
    @Override
    public void drive() {
        System.out.println(Constants.DRIVE_ELECTRIC_CAR);
    }
}
