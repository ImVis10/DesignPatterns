package decoratorPattern;

public class Oreos extends Toppings {

	public Oreos(String description, IceCream ice) {
		super(description, ice);
	}

	@Override
	public String getDescription() {
		return ice.getDescription() + " with oreos";
	}

	@Override
	public double cost() {
		return ice.cost() + 100;
	}

}
