package StrategyPattern.Problem;

import StrategyPattern.Constants.Constants;

public class BMW extends Car {
    
    @Override
    public void drive() {
        System.out.println(Constants.DRIVE_LUXURY_CAR);
    }
}
