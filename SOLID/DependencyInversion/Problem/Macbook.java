package SOLID.DependencyInversion.Problem;

public class Macbook {
    private final WiredKeyboard kb;
    
    public Macbook(WiredKeyboard kb) { // using concrete class here, so not abiding by DEPENDENCY INVERSION  principle
        this.kb = kb; 
    }

    /** what exactly is the problem by not abiding to DEPENDENCY INVERSION?
     *  Suppose we want to make Macbook use Wireless keyboard in the future instead of wired ones.
     *  We can't support that what with the current code as we are dependent on WiredKeyboard here.
     *  i.e. We can't initialize Macbook(WirelessKeyboard kb) from outside or from anyplace.
     *  Why? Because we're dependent on the concrete class WiredKeyboard rather than the interface Keyboard
     */

     /* This is what DEPENDENCY INVERSION preaches -- DEPEND ON ABSTRACTIONS (INTERFACES), NOT CONCRETE CLASSES */
}
