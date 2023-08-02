package FactoryPattern.Solution;

import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape wanted: ?");

        String shapeName = scanner.nextLine();
        scanner.close();

        Shape shape;

        switch(shapeName) {
            case "CIRCLE":
                shape =  new Circle();
                break;
            case "SQUARE":
                shape =  new Square();
                break;
            default:
                throw new Exception("Shape unrecognizable");
        }
        shape.draw();
    }
}
