package Factory;

import Chair.Chair;
import CoffeeTable.CoffeeTable;
import Sofa.Sofa;

public interface FurnitureFactory {
    public Chair makeChair();
    public CoffeeTable makeCoffeTable();
    public Sofa makeSofa();
}
