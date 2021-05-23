package decoratorPattern;

public class ButterScotch extends IceCream {
	
	public ButterScotch(String description) {
		super(description);
	}

	@Override
	public double cost() {
		return 150;
	}
}
