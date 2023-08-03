package Factory;

import Chair.Chair;
import Chair.ModernChair;
import CoffeeTable.CoffeeTable;
import CoffeeTable.ModernCoffeeTable;
import Sofa.ModernSofa;
import Sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair makeChair() {
        Chair modernChair = new ModernChair();
        System.out.println("Making an modern chair. Chair has legs: " + modernChair.hasLegs());
        return modernChair;
    }

    @Override
    public CoffeeTable makeCoffeTable() {
        CoffeeTable modernCoffeeTable = new ModernCoffeeTable();
        System.out.println("Making an modern coffee table. Coffee table has drawers: " + modernCoffeeTable.hasDrawers() + " and coffee cup holder: " + modernCoffeeTable.hasCoffeeCupHolder());
        return modernCoffeeTable;
    }

    @Override
    public Sofa makeSofa() {
        Sofa modernSofa = new ModernSofa();
        System.out.println("Making an modern sofa. Sofa is leather cushioned: " + modernSofa.hasLeatherCushioning() + " and modular: " + modernSofa.isModular());
        return modernSofa;
    }
}
