package labScanner;

import java.util.Scanner;

public class ExampleOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type a line and hit enter.");
		//must declare variable to hold input
		String line = scan.nextLine();
		//the line var will be printed
		System.out.println("You typed: " + line);
		
		//must close the scanner object
		scan.close();
		
		//now testing with numbers
		String num ="1 2 3 5 7 9";
		scan = new Scanner(num);
		
		//using a while loop to parse
		while (scan.hasNextInt()) {
			System.out.println(scan.nextInt());
		}
		scan.close();
		
	}
}
