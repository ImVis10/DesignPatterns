package StrategyPattern.Solution.Startegy;

import StrategyPattern.Constants.Constants;

public class NormalCarDriveStrategy implements DriveStrategy {
    
    @Override
    public void drive() {
        System.out.println(Constants.DRIVE_NORMAL_CAR);
    }
}
