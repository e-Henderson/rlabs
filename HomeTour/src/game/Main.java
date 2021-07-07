package game;

public class Main {
	public static void main(String[] args) {
		/*this is where everything will be printed to so it can be
		 * seen since it's the main method. 
		 * 
		 * NEED: game-loop, display prompt, collect input and parse
		 * input
		 * 
		 * SOMEWHERE THERE SHOULD BE A QUIT OPTION
		 * 
		 * whatever goes in the methods, they'll need to be instantiated
		 * here in main
		 */
		Main p = new Main();//used for printRoom
		//Main collectIn = new Main();//used for collectInput
		//Main parseIn = new Main();//used for parse 
		//place scanner instantiation here
		//game loop goes in this portion. 
		/*while some condition is not met
		 * 		print a prompt/the room: player.printRoom(Player player);
		 * 		collect the input: collectIn.collectInput():
		 * 		parse the input: parseIn.parse(String[], Player);
		 */
		
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
		System.out.println("::Current Room::");
		//first need to getCurrentRoom, then set the current room
		System.out.println("Name: "+ player.getCurrentRoom().getName());//name of room
		System.out.println("Short Description: "+player.getCurrentRoom().getShortDes());//short descrip
		System.out.println("Long Description: "+player.getCurrentRoom().getLongDes());//long descript 	
	}

}
