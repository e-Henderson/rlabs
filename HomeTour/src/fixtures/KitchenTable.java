package fixtures;

public class KitchenTable extends Fixture implements Interactable{

	public KitchenTable(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("You notice how cluttered the table is and think twice about touching it.");
		System.out.println("You sip your coffee.");
	}
	
}
