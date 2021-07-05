package labCompositeRelationships;

public class ClassB {
	ClassA cA = new ClassA();//we've created an instance of ClassA
	
	public static void main(String[] args) {
		ClassB cB=new ClassB();//we've done the same for ClassB
		cB.cA.setName("Taylor");
		/*
		 * so the above is using the dot op, to call
		 * on the methods defined in ClassA. The setter
		 * is being used and the the getter will be used to 
		 * print said name.
		 */
		System.out.println(cB.cA.getName());
		/*
		 * This able to happen because the setters and getters
		 * were defined in another class, called in this one
		 * and since this one has the main method, we can print the result
		 * of the relationships. 
		 */
		
	}
}
