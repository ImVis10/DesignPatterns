package FactoryPattern.Solution;

public class SquareFactory extends ShapeFactory {

    @Override
    Shape createShape() {
        return new Square();
    }
}
