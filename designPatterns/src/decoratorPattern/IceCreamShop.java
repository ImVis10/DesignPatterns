package decoratorPattern;

public class IceCreamShop {

	public static void main(String[] args) {
		ButterScotch butterScotch = new ButterScotch("ButterScotch Icecream");
		System.out.println(butterScotch.getDescription() + " : " + butterScotch.cost());
		
		Caramel caramel = new Caramel("", butterScotch);
		System.out.println(caramel.getDescription() + " : " + caramel.cost());
		
		Vanilla vanilla = new Vanilla("Vanilla Icecream");
		System.out.println(vanilla.getDescription() + " : " + vanilla.cost());
		
		Oreos oreos = new Oreos("", vanilla);
		System.out.println(oreos.getDescription() + " : " + oreos.cost());
		
		Sprinkles sprinkles = new Sprinkles("", oreos);
		System.out.println(sprinkles.getDescription() + " : " + sprinkles.cost());
		

	}

}
