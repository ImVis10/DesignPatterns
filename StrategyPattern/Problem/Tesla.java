package StrategyPattern.Problem;

import StrategyPattern.Constants.Constants;

public class Tesla extends Car {
    
    @Override
    public void drive() {
        System.out.println(Constants.DRIVE_ELECTRIC_CAR);
    }
}
