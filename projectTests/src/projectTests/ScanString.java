package projectTests;

import java.util.Scanner;

public class ScanString {
	public static void main(String[] args) {
		
	
	//instantiate scanner class
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name: " );
	//System.out.println("Your name is: " + scan.nextLine());
	String length = scan.nextLine();
	System.out.println("Your name is: "+ length + " and it is: " + length.length() +
			" long");
	scan.close();
	}
}
