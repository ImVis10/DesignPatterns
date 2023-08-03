package Factory;

import Chair.Chair;
import Chair.EverydayChair;
import CoffeeTable.CoffeeTable;
import CoffeeTable.EverydayCoffeeTable;
import Sofa.EverydaySofa;
import Sofa.Sofa;

public class EverydayFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair makeChair() {
        Chair everydayChair = new EverydayChair();
        System.out.println("Making an everyday chair. Chair has legs: " + everydayChair.hasLegs());
        return everydayChair;
    }

    @Override
    public CoffeeTable makeCoffeTable() {
        CoffeeTable everydayCoffeeTable = new EverydayCoffeeTable();
        System.out.println("Making an everyday coffee table. Coffee table has drawers: " + everydayCoffeeTable.hasDrawers() + " and coffee cup holder: " + everydayCoffeeTable.hasCoffeeCupHolder());
        return everydayCoffeeTable;
    }

    @Override
    public Sofa makeSofa() {
        Sofa everydaySofa = new EverydaySofa();
        System.out.println("Making an everyday sofa. Sofa is leather cushioned: " + everydaySofa.hasLeatherCushioning() + " and modular: " + everydaySofa.isModular());
        return everydaySofa;
    }
    
}
