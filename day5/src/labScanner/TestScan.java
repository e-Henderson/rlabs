package labScanner;

import java.util.Scanner;

public class TestScan {
	public static void main(String[] args) {
		int menuSelection=0;//variable must be initialized
		Scanner s = new Scanner(System.in);
		
		//System.out.println("Enter a number: ");
		//menuSelection  = s.nextInt();
		//System.out.println("Your number was: "+ menuSelection);
		//s.close();
		
		while(menuSelection != 4) {//I have a feeling that != 4 might cause a problem. might need to 
			//push menu options out of while loop. 
			System.out.println("Enter an option: ");
			System.out.println(String.format("%s%n%s", "1. You're a friend!","2. You're really cool!"));
			System.out.println(String.format("%s%n%s","3. You're great!", "4. Have a nice day!"));
			/*
			 * have options, now how to...I think line 17 should be placed after the phrases are printed
			 * then below that, add the scanner so the option can be sent to a switch statement
			 * that makes the options a case basis so we have the break options needed. 
			 */
			menuSelection  = s.nextInt();
			switch(menuSelection) {
			case 1: System.out.println("You're a friend!");
			break;
			case 2: System.out.println("You're really cool!");
			break;
			case 3: System.out.println("You're great!");
			break;
			case 4: System.out.println("Have a nice day!");
			}
		}
		s.close();
		
	}
}
