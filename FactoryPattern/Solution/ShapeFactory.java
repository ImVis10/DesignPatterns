package FactoryPattern.Solution;

/** Factory is a managed container of the objects. It is the single source of objects, it'll be easier to maintain the code.*/
public abstract class ShapeFactory {

    abstract Shape createShape();
}
