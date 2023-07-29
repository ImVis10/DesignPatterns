package SOLID.DependencyInversion.Solution;

import SOLID.DependencyInversion.Problem.Keyboard;

public class Macbook {

    private final Keyboard kb;

    public Macbook(Keyboard kb) { // now Macbook is dependent on interface 'Keyboard' rather than concrete classes.
        this.kb = kb;
    }
    
}
