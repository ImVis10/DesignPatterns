package SOLID.DependencyInversion.Problem;

public class Wirelesskeyboard implements Keyboard {

    @Override
    public Boolean needWire() {
        return false;
    }
    
}
