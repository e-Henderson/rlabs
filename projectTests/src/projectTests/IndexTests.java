package projectTests;

import java.util.Scanner;

public class IndexTests {
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		String directions[]= {"north","east","west","south"};
		
		//first make a print statement that asks which direction to go
		
		System.out.println("Which direction would you like to go?");
		System.out.println("\n Enter 'quit' to quit.");
		System.out.println("Select from these directions (type 'go' and then direction): \n");
		//System.out.println("Select from these directions:" +"\n" +directions);
		for (int i=0; i<directions.length;i++) {
			System.out.println(directions[i]);//prints the directions 
			
		}
		String inLine = scan.nextLine();
		int index = inLine.indexOf(0);
		String[] command = inLine.split(" ",index);
		//System.out.println("\n"+command[0]);
		//System.out.println(command[1]+ "\n");
		/*for(int i=0;i<command.length;i++) {
			//System.out.println(command[i]);
			System.out.println(command[i]);
			
		}*/
		
		if(command[0].equals("go") | command[0].equals("GO")) {
			System.out.println("going " + command[1]);
		}else if(command[0].equals("quit") | command[0].equals("QUIT")) {
			System.out.println("Quitting");
		}
		else {
			System.out.println("Try again");
		}
		/*
		 * the above if/elif statement blocks will essentially aid in moving around from room to room. Just need to set 
		 * them up so they will actually work. Spend some time here or making another test class to understand exits and
		 * whatnot.
		 */
		
		
	}

}