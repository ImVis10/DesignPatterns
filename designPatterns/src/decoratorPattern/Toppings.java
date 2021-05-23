package decoratorPattern;

public abstract class Toppings extends IceCream {
	
	protected IceCream ice;
	
	public Toppings(String description, IceCream ice) {
		super(description);
		this.ice = ice;
	}
	
	public abstract String getDescription();
}
