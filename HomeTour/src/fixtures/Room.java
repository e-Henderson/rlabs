package fixtures;

public class Room extends Fixture{ 
	
	private Room[] exits =new Room[5];
	//private Room[] items = new Room[5];
	private Object[] items = new Object[5];
	
	//insert Room constructor here
	public Room (String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[7]; //size is my choice
	}
	
	//this is the getter for the index
	public Room[] getExits() {
		return this.exits;
	}
	
	//public Room[] getInteract()
	
	//this will get the specific direction passed as an argument 
	public Room getExit(String direction) {
		direction=direction.toLowerCase();
		if(direction.equals("north"))
			return exits[0];
		else if(direction.equals("east"))
			return exits[1];
		else if(direction.equals("west"))
			return exits[2];
		else if(direction.equals("south"))
			return exits[3];
		//return null;
		else
			return exits[5];
	}
	
	
	public void setExits(Room north, Room east, Room west, Room south) {
		this.exits[0]=north;
		this.exits[1]=east;
		this.exits[2]=west;
		this.exits[3]=south;
		this.exits[4]=this;
		
	}
	
	public Object getItems(String interact) {
		interact = interact.toLowerCase();
		if(interact.equals("coffee"))
			return items[0];
		else if(interact.equals("table"))
			return items[1];
		else if(interact.equals("picture"))
			return items[2];
		else if(interact.equals("door"))
			return items[3];
		else if(interact.equals("knock"))
			return items[4];
		else 
			return items[5];
		
	}
	
	/*public void setCoffee(Room coffee) {
		this.items[0]=coffee;
	}*/
	public void setItems(Object coffeepot, Object table, Object picture, Object door, Object knock) {
		this.items[0]=coffeepot;
		this.items[1]=table;
		this.items[2]=picture;
		this.items[3]=door;
		this.items[4]=knock;
	}

	
	
}
