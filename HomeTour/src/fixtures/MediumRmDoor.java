package fixtures;

public class MediumRmDoor extends Fixture implements Interactable{

	public MediumRmDoor(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("You try the door but again you see the person sleeping.");
		System.out.println("You drink more coffee.");
	}
	
}
