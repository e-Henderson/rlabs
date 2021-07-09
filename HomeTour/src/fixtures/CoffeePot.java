package fixtures;

public class CoffeePot extends Fixture implements Interactable{

	public CoffeePot(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("You pour yourself a cup of coffee in a nearby mug.");
	}
	
}
