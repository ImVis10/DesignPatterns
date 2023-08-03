import java.util.Scanner;

import Factory.EverydayFurnitureFactory;
import Factory.FurnitureFactory;
import Factory.ModernFurnitureFactory;
import Factory.VictorianFurnitureFactory;

public class Client {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Furniture Family: ?");

        String furnitureFamily = scanner.nextLine();
        scanner.close();

        FurnitureFactory furnitureFactory;

        switch(furnitureFamily) {
            case "EVERYDAY":
                furnitureFactory = new EverydayFurnitureFactory();
                break;
            case "MODERN":
                furnitureFactory = new ModernFurnitureFactory();
                break;
            case "VICTORIAN":
                furnitureFactory = new VictorianFurnitureFactory();
                break;
            default:
                throw new Exception("unrecognizable furniture family");
        }

        ClientConfiguration config = new ClientConfiguration(furnitureFactory);
        config.makeChair();
        config.makeCoffeTable();
        config.makeSofa();
    }
    
}
