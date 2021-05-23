package decoratorPattern;

public class Vanilla extends IceCream {

	public Vanilla(String description) {
		super(description);
	}

	@Override
	public double cost() {
		return 100;
	}

}
