package SOLID.DependencyInversion.Problem;

public class WiredKeyboard implements Keyboard {

    @Override
    public Boolean needWire() {
        return true;
    }
    
}
