package main;

import java.util.Scanner;

public class DoWhileScanTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//declare & initialize variables
		int menuSelect = 0;
		//double qty =0;
		
		DoWhileScanTest mToK = new DoWhileScanTest();
		DoWhileScanTest qToL = new DoWhileScanTest();
		DoWhileScanTest nToS = new DoWhileScanTest();
		DoWhileScanTest sQuant = new DoWhileScanTest();
		
		/*Instead of the normal while loop, I want to try a Do-While loop
		 * in order to test functionality for the HomeTour project.
		 * do the following
		 * 		print the menu options
		 * 		provide the options
		 * 		
		 * 		take in the number selection
		 * 		
		 * 		menuSelect will switch 
		 * 			1st case-first menu option
		 * 			2nd case-second menu option
		 * 			3rd case- third menu option
		 * 			4th case-fourth menu option
		 * while menuSelect is not equal to 4 
		 */
		do {
			System.out.println("Select an option from the menu. \n");
			System.out.printf("1. Convert Miles to Kilometers \n", 
					"2. Convert Quarts to Liters \n"); 
			System.out.printf("3. Convert Newtons to Slugs \n", 
					"4. Quit menu");
			
			menuSelect = s.nextInt();
			
			switch(menuSelect) {
			case 1: DoWhileScanTest.scanQty();
					System.out.println("Miles to Kilo conversion: " + mToK.conMtoK(scanQty()));
			}
			
		}while (menuSelect != 4);
		s.close();
	}
	//need to create scanning method
	//takes in s which is the object
		//stores s in a variable called qty
		public static double scanQty() {
			Scanner s2 =new Scanner(System.in);
			double qty=0;
			System.out.println("Enter Quantity: ");
			qty=s2.nextInt();
			return qty;
		}
	
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
