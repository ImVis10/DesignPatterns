package Factory;

import Chair.Chair;
import Chair.VictorianChair;
import CoffeeTable.CoffeeTable;
import CoffeeTable.VictorianCoffeeTable;
import Sofa.Sofa;
import Sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair makeChair() {
        Chair victorianChair = new VictorianChair();
        System.out.println("Making a victorian chair. Chair has legs: " + victorianChair.hasLegs());
        return victorianChair;
    }

    @Override
    public CoffeeTable makeCoffeTable() {
        CoffeeTable victorianCoffeeTable = new VictorianCoffeeTable();
        System.out.println("Making a victorian coffee table. Coffee table has drawers: " + victorianCoffeeTable.hasDrawers() + " and coffee cup holder: " + victorianCoffeeTable.hasCoffeeCupHolder());
        return victorianCoffeeTable;
    }

    @Override
    public Sofa makeSofa() {
        Sofa victorianSofa = new VictorianSofa();
        System.out.println("Making an victorian sofa. Sofa is leather cushioned: " + victorianSofa.hasLeatherCushioning() + " and modular: " + victorianSofa.isModular());
        return victorianSofa;
    }
}
