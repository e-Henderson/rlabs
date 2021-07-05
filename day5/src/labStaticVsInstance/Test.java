package labStaticVsInstance;

public class Test {
	public static void main(String[] args) {
		A.staticCount=2494;
		System.out.println("class A staticCount: "+A.staticCount);
		
		A a = new A();
		
		System.out.println(a.instanceCount);//creates instance
		System.out.println(A.staticCount);//the entire A class must be accessed
		
		A a2 = new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		/*
		 * Instance members are associated with objects
		 * in memeory. a and a2 are both separate objects
		 * calling on the same thing. But they both print
		 * 1 separately because they are two separate objects.
		 */
		
		a.instanceCount=15;//this is only changing the instance of a.
		//that goes with the object of that particular part
		
		System.out.println("object a instanceCount: "+a.instanceCount);
		System.out.println("object a2 instanceCount: "+a2.instanceCount);
		
		System.out.println("class A staticCount: "+ A.staticCount);
		/*
		 * The reason that instead of 2495, is because the two earlier
		 * static declarations are contributing to the addition. 
		 * 
		 */
		
		
	}
}
