package labConstructors;

public class Constructors {
	
	//creating constructor
	public Constructors(int value) {
		System.out.println(value);
	}
	
	//default constructor
	public Constructors() {
		System.out.println("Default constructor.");
	}
	//main method below
	public static void main(String[] args) {
		Constructors cons = new Constructors(5983);
		/*
		 * notice that Constructors(5983) now has 
		 * an argument and is no longer a default
		 * constructor. WE have defined a 
		 * constructor above and we can use 
		 * that.
		 * 
		 *  However we can still can the default 
		 *  constructor provided by the compiler.
		 */
		Constructors consNoArg = new Constructors();
		//however, the compiler will now scream
		/*
		 * this is because there is a defined 
		 * Constructor (int value) being
		 *  used. To have a default constructor
		 *  it must be coded into the program.
		 */
		
	}
}
