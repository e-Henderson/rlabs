package game;

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	//static String[] input = {"",""};
	//String input=null;
	//these are global variables
	//Room currentRoom;
	
	public static void main(String[] args) {
		RoomManager rm =new RoomManager();
		rm.init();
		String input=null;
		//Main p = new Main();//used for printRoom
		//Main collectIn = new Main();//used for collectInput
		//Main parseIn = new Main();//used for parse 
		//place scanner instantiation here
		//game loop goes in this portion. 
		/*while some condition is not met-do while bool game =true
		 * 		print a prompt/the room: player.printRoom(Player player);
		 * 		collect the input: collectIn.collectInput():
		 * 		parse the input: parseIn.parse(String[], Player);
		 */
		Player player = new Player();
		player.currentRoom=rm.startingRoom;
		
		do {
			System.out.println("Commands: " + "\n type 'go north','go east', 'go west', 'go south'\n ");
			printRoom(player);//should print the current room
			System.out.println("\nWhat would you like to do?");
			//collectInput(String input);//collect input
			//String user =s.nextLine();
			input=parse(collectInput(s.nextLine()),player);//parse input //ok so the input arg should be from collectInput
		}while(input != "quit");
	}
	//need print room method for the Player
	//print a prompt to the console for the current room
	public static void printRoom(Player player) {
		//place prompt stuff here
		/*prints prompt of the current room and calls on the Player
		 * class. Since the player class imported the Room class from 
		 * fixtures package, the prompt should be called from the player.
		 * Similar to the Engine and FlyingVehicle classes. 
		 */
		
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
		//System.out.println(input);
		String action = command[0].toLowerCase().intern();
		String details= null;
		
		if(command.length>1) {
			details=command[1].toLowerCase().intern();
		}
		//good to have a line for additional functionality
		//command[0] = command[0].toUpperCase().intern();
		//command[1] = command[1].toUpperCase().intern();
		
		//need a if/else if
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
