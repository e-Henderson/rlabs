package projectTests;

import java.util.Scanner;

public class ParsingTests {
	//testing parsing functionality with strings
	static Scanner scan = new Scanner(System.in);//static essentially makes it global like in c++
	
	public static void main(String[] args) {
		collect();//prints and accepts input 
	}
	/*method to collect user input
	 * system will print a line asking for input 
	 * input will be scanned in 
	 * input will be sent to another function that parses it
	 */
	public static String collect() {
		System.out.println("Enter info: ");
		String inLine = scan.nextLine();
		int inDex = inLine.indexOf(0);
		String[] var1 = inLine.split(" ", inDex);
		for (String unVa:var1) {
			//System.out.println(unVa);
			String x=unVa.toUpperCase();
			System.out.println(x);
		}
		return null;//have a feeling that this will be similar to 
		//return 0; in c++. Thought it does get around the for loop problem
		
		
	}
}
