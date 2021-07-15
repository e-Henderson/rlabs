package game;

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		RoomManager rm =new RoomManager();
		rm.init();
		String input=null;
	
		Player player = new Player();
		player.currentRoom=rm.startingRoom;
		
		do {
			System.out.println("Commands: " + "\n type 'go north','go east', 'go west', 'go south'\n ");
			printRoom(player);//should print the current room
			System.out.println("\nWhat would you like to do?");
			input=parse(collectInput(s.nextLine()),player);//parse input //ok so the input arg should be from collectInput
		}while(input != "quit");
	}

	public static void printRoom(Player player) {
	
		
		System.out.println("::Current Room::\n");
		//first need to getCurrentRoom, then set the current room
		System.out.println("Name: "+ player.getCurrentRoom().name);//name of room
		System.out.println("Short Description: "+ player.getCurrentRoom().shortDescription);//short descript
		System.out.println("Long Description: "+ player.getCurrentRoom().longDescription);//long descript 	
	}
	public static String[] collectInput(String input) {
		String[] in = input.split(" ");
		return in;
		};
		
	

	public static String parse(String[] command, Player player) {
		String action = command[0].toLowerCase().intern();
		String details= null;
		
		if(command.length>1) {
			details=command[1].toLowerCase().intern();
		}
		
		if(action == "go" | action == "move") {
			player.currentRoom=player.currentRoom.getExit(details);
			//call the direction array and move there or to the next room, so the exit array
		}else if(action == "quit") {
			//ends game
			return "quit";
		}
		return null;
			
	}

}
