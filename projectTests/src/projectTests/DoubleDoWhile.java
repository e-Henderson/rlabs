package projectTests;

import java.util.Scanner;

public class DoubleDoWhile {
	public static void main(String[] args) {
		//DoubleDoWhile ddw = new DoubleDoWhile();
		boolean quit = false;
		Scanner in = new Scanner(System.in);
		//String opt = in.next();
		do {
			System.out.println("Choose an option: ");
			menu();
			String opt = in.next();
			
			switch(opt) {
			case "1":
				System.out.println("Hello");
				break;
			case "2":
				System.out.println("Keelah Se'lai");
				break;
			case "3":
				quit = true;
				break;
			default:
				break;
			}
		}while (!quit);
		in.close();
		System.out.println("You have exited. ");
	}
	private static void menu() {
		System.out.println("1. Greeting ");
		System.out.println("2. Goodbye ");
		System.out.println("3. Exit ");
	}
}
