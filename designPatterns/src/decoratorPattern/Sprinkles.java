package decoratorPattern;

public class Sprinkles extends Toppings {

	public Sprinkles(String description, IceCream ice) {
		super(description, ice);
	}

	@Override
	public double cost() {
		return ice.cost() + 50;
	}

	@Override
	public String getDescription() {
		return ice.getDescription() + " with sprinkles";
	}

}
