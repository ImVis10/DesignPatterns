package decoratorPattern;

public abstract class IceCream {
	private String description;
    
	public IceCream(String description) {
		super();
		this.description = description;
	}
    
	public String getDescription() {
		return description;
	}
    
	public abstract double cost();
}
