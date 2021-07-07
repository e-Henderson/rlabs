package game;

import java.util.Scanner;
/*Placing all input and parsing stuff here. It was getting too messy in the main method
 * this can be called there. Now can focus on the specifics for the input stuff. 
 * 
 */
public class UserInput {
	private static String[] collectInput() {
		Scanner s = new Scanner(System.in);//defined scanner object here
		//need a line to ask for input? 
		//System.out.println();
		String action = s.nextLine();//will take input
		/*since it's collecting a string, only string methods should
		 * be used in conjunction with the scanner class
		 * 
		 * The input needs to be divided so I'm thinking decision structures
		 * if action is taken
		 * 		then something happens 
		 * 		return the thing
		 */
		
		s.close();//close scanner obj
		return null;
	}

	private static void parse(String[] command, Player player) {
		//place switch statements here. look at UnitConverter for the switch
		//like stuff
		
		//one final method to take the above input and parse it
		//takes the input and Player object and resolves the command
		//**First index passed in String[] should be the action
		/*
		 * once the action is there, use a switch statement 
		 * for the target and "case"
		 * 
		 */
	}
}
