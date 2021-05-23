package decoratorPattern;

public class Caramel extends Toppings{

	public Caramel(String description, IceCream ice) {
		super(description, ice);
	}

	@Override
	public String getDescription() {
		return ice.getDescription() + " with caramel";
	}

	@Override
	public double cost() {
		return ice.cost() + 75;
	}

}
