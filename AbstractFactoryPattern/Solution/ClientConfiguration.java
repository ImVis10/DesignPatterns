import Chair.Chair;
import CoffeeTable.CoffeeTable;
import Factory.FurnitureFactory;
import Sofa.Sofa;

public class ClientConfiguration {
 
    FurnitureFactory furnitureFactory;
    Chair chair;
    CoffeeTable coffeeTable;
    Sofa sofa;

    ClientConfiguration(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Chair makeChair() {
        this.chair = furnitureFactory.makeChair();
        return this.chair;
    }

    public CoffeeTable makeCoffeTable() {
        this.coffeeTable = furnitureFactory.makeCoffeTable();
        return this.coffeeTable;
    }

    public Sofa makeSofa() {
        this.sofa = furnitureFactory.makeSofa();
        return this.sofa;
    }

}
