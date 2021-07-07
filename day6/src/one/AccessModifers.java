package one;

import two.ProtectedSubClass;

public class AccessModifers {
	public static void main(String[] args) {
		//access class methods
		//NOTE: the main method uses the public modifier so this class
		//can be invoked by any other class 
		Person adam = new Person();//creates instance of class var person
		adam.age = 15;//calls on public variable age
		
		System.out.println(adam.age);//prints the age
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
		
		
	}
}
