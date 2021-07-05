package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection=0;//better to initialize variables now for while loop stuff 
		double qty=0;
		
		//objects to call
		Converter mToK = new Converter();
		Converter qToL = new Converter();
		Converter nToS = new Converter();
		
		Scanner s =new Scanner(System.in);
		
		//while menuSelection does not equal "lastOption"
			//print a menu with options-maybe make a menu method?
			/*
			 * menu options:(this is where the switch statements will be)
			 * 1. Miles to Kilometers
			 * 2. Quarts to Liters
			 * 3. Newtons to Slugs Yeah I promise this one is real. I wish it wasn't.
			 * 4. Quit 
			 * 
			 * while inside the loop call the scanner method. 
			 * make the conversions their own methods 
			 */
		while(menuSelection != 4) {
			System.out.println("Choose an option from the menu: ");
			System.out.println(String.format("%s%n%s", "1. To convert Miles to Kilometers." , "2. To convert Quarts to Liters"));
			System.out.println(String.format("%s%n%s", "3.To convert Newtons to Slugs. ", "4. Quit."));
			/*
			 * Maybe switch the quantity and menu statements. Because it does work, but it should
			 * immediately quit if four is chosen. It doesn't. Maybe try an if statement? 
			 */
			
			menuSelection=s.nextInt();
			//System.out.println("Enter quantity: ");//should make input collection a separate method. 
			//qty = s.nextDouble();
			
			switch (menuSelection) {
			case 1:
				System.out.println("Enter quantity: ");
				qty = s.nextDouble();
				System.out.println("Miles to Kilometer conversion = " + mToK.conMtoK(qty));//mToK
			break;
			case 2: 
				System.out.println("Enter quantity: ");
				qty = s.nextDouble();
				System.out.println("Quarts to Liters conversion = " + qToL.conQtoL(qty));//qToL
			break;
			case 3: 
				System.out.println("Enter quantity: ");
				qty = s.nextDouble();
				System.out.println("Newtons to Slugs conversion = " + nToS.conNtoS(qty));//nToS
			break;
			case 4: System.out.println("Exiting menu. ");//nothing
			}
			
		}
		s.close();
		//need a scanner object to collect user input
		//switch statement and case matching the available options
		
	}
	
	//place scanner method here.
	//public double scanQty(double qty) {
		//qty=s.nextDouble;
	//}
	
	//place conversion method (miles to kilo)
	public double conMtoK(double qty) {
		return qty*1.609;
	}
	//conversion method (quarts to liters)
	public double conQtoL(double qty) {
		return qty*0.946;
	}
	//conversion method (Newtons to slugs)
	public double conNtoS(double qty) {
		return qty*0.0070;
	}
}
