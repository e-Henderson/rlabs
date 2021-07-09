package fixtures;

public class SmallRmInteract extends Fixture implements Interactable{

	public SmallRmInteract(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("The person sitting at the laptop looks at your coffee mug and remembers theirs.");
	}
	
}
