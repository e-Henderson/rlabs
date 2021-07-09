package game;

//import fixtures.CoffeePot;
//import fixtures.KitchenTable;
import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	public Room[] rooms = new Room[10];
	
	public void init() {
	Room kitchen = new Room("Kitchen\n", "a small Kitchen\n", "The kitchen is small with a window and "
			+ " sink and coffee pot to your left, diagonally. \nTo your immediate left, there is a stove." + "\n" +
			"In front of you there is a cluttered table. Don't look at it." + "\n" +
			"To your right, is the entrance to the living room." + "There is a door behind you that goes outside.");
	this.rooms[0]=kitchen;
	this.startingRoom=kitchen;
	/*CoffeePot cp = new CoffeePot("Coffee Pot", "Small coffee pot containing fresh coffee.", "The coffee pot has "
			+ "\n just finished brewing. The aroma of fresh coffee fills the air." + "There is an empty cup nearby.");
	KitchenTable kt = new KitchenTable("Cluttered table", "Table is covered with various things.", "The table is cluttered "
			+ "\n with various items. It needs to be cleaned, but that isn't your job.");*/
		
	Room livingRoom = new Room("Living Room\n", "Medium-sized Living Room\n", "The Living Room"+
	"\n has a couch in front of you, a recliner in the middle of the room with a TV in front of it."+
			"\n There are various picture frames on the walls. To your left, is a hallway.");
	this.rooms[1]=livingRoom;
	//this.startingRoom=livingRoom;
	
	Room hallway = new Room("Hallway\n", "Short hallway which has doors to three rooms.\n", "The hallway "+
	"\n contains picture frames as well and is lit by a single light." + " There are two doors on the right of the hall and one on the left.");
	this.rooms[2]=hallway;
	//this.startingRoom=hallway;
	
	Room bathRoom = new Room("Bathroom\n", "One-Person Bathroom\n", "Bathroom contains a closet, sink with a mirror, toliet and shower.");
	this.rooms[3]=bathRoom;
	
	Room masterBedroom = new Room("Master Bedroom\n", "Large bedroom that contains various fixtures.\n", "The door is slighty open"
			+"\n and you can see there is a bed in the center of the room. Nearby, there is a heater that runs along the bottom "
			+"\n of the west wall. ");
	this.rooms[4]=masterBedroom;
	
	Room mediumRm = new Room("Medium Room\n", "Door is slightly open.\n", "The door to this room is slightly open." +
	"\n From what you can see, someone is sleeping." + "It's best not to disturb them honestly.");
	this.rooms[5]=mediumRm;
	
	Room smallRm = new Room("Small Room\n", "The door is wide open.\n", "Inside this room, you can see that it is fairly small."
			+ "\n From the entryway, you can see various paintings hanging on the wall. It looks like an old " + 
			"\n Parisian Salon the way they are hung so close together." + "To your right you see both a dresser and bed." +
			"\n On top of the dresser is a covered microscope and the bed is a mess." + "In front of you, a person is "
			+"\n sitting at a desk frantically finishing this project, will a cold cup of coffee next to them.");
	this.rooms[6]=smallRm;
	
	Room outside = new Room("Outside\n", "Lawn leading to kitchen\n", "Here you have the kitchen door in front of you. "
			+"\n To your left, you see a the backyard." + "To your right, you see a car parked in the driveway.");
	this.rooms[7]=outside;
	
	Room backYard = new Room("Backyard\n", "Sloping hill that ends in a treeline.\n", "The backyard has a large tree in the center of "
			+"\n it. Garbage cans are located behind house." + "Looking towards the end of the yard, you see a treeline."
			+"\n It's fairly dense for being in a kind of urban area.");
	this.rooms[8]=backYard;
	
	Room frontYard = new Room("Front yard\n", "Front yard has two trees and a bench between them.\n", "The front yard is "
			+ "\n fairly large." + "Between the two trees, there is a rocking bench. Attached to the farthest tree, "
			+"\n there is a feeder box for squirrels. It's half full with corn." + "In the driveway, there are two cars.");
	this.rooms[9]=frontYard;
	
	frontYard.setExits(frontYard, frontYard, outside, outside);
	backYard.setExits(backYard, outside, backYard, outside);
	outside.setExits(kitchen, frontYard, backYard, outside);
	kitchen.setExits(kitchen, livingRoom, kitchen, outside);
	livingRoom.setExits(hallway, livingRoom, kitchen, livingRoom);
	hallway.setExits(smallRm, bathRoom, masterBedroom, livingRoom);
	bathRoom.setExits(mediumRm, bathRoom, masterBedroom, livingRoom);
	masterBedroom.setExits(smallRm, hallway, masterBedroom, livingRoom);
	mediumRm.setExits(bathRoom, masterBedroom, mediumRm, smallRm);
	smallRm.setExits(hallway, mediumRm, smallRm, hallway);
	}
	public Room getStartingRoom() {return this.startingRoom;}
	public void setStartingRoom(Room startingRoom) {this.startingRoom=startingRoom;}
	
	public Room[] getRooms() {return this.rooms;}
	public void setRooms(Room[] rooms) {this.rooms=rooms;}

}
