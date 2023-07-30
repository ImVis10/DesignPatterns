package StrategyPattern.Solution.Startegy;

import StrategyPattern.Constants.Constants;

public class LuxuryCarDriveStrategy implements DriveStrategy {
    
    @Override
    public void drive() {
        System.out.println(Constants.DRIVE_LUXURY_CAR);
    }
}
