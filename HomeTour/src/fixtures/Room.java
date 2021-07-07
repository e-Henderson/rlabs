package fixtures;

public class Room extends Fixture{//will need to extend Fixture 
	/*
	 * things that this class will have
	 * Room [] exits: so the exits will be assigned a direction/index
	 * 	ex: north=0,east=1, so on and so forth
	 * 
	 * Room constructor that accepts a name, shortDescription, longDescription
	 * 
	 */
	//So Room[] exits is essentially an array. each direction needs to be within
	//four directions, so [4]; 
	Room[] exits =new Room[4];
	/*where: **keep in mind the indexing portion of this 
	 * 0=north
	 * 1=east
	 * 2=west
	 * 3=south
	 */
 	
	//insert Room constructor here
	public Room (String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		//this.exits = new Room[4]; //size is my choice
	}
	
	//this is the getter for the index
	public Room[] getExits() {
		return this.exits;
	}
	
	//this will get the specific direction passed as an argument 
	public Room getExit(String direction) {
		return null;  
	}
}
