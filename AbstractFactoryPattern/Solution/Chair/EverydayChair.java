package Chair;
public class EverydayChair implements Chair {
    
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return true;
    }
}
