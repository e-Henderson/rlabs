package game;

//import fixtures.Fixture;
import fixtures.Room;

public class Player {
	//variable for the current room
	public Room currentRoom;
	//the variable is there so I'm going to guess there will need to 
	//be getters and setters
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	public void setCurrentRoom(Room startingRoom) {
		this.currentRoom=startingRoom;
	}
}
