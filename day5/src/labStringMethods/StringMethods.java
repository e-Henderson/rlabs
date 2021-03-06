package labStringMethods;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.equals("Hello"));
		/*
		 * the equals() method determines if one String
		 * is equivalent to another String. It accepts
		 * one parameter and will return a boolean true
		 * if it's equal. 
		 * 
		 * Invoking a method also requires the use of " . ".
		 * This is the dot operator. So .equals() takes an 
		 * argument and passes it through that particular
		 * method.  
		 */
		
		//using the length method which prints the length.
		System.out.println(str.length());//length = 5.
		//length accepts no parameters. 
		
		//using indexOf() method
		System.out.println(str.indexOf("H"));
		//prints 0 which is to expected since its
		//at the first index
	}
}
