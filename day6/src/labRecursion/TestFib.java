package labRecursion;

public class TestFib {
	public static void main(String[] args) {
		Fib fib = new Fib();
		
		int result = fib.fibonacci(2);//this is looking at the 2nd position
		System.out.println(result);
		
		result = fib.fibonacci(5);//this is looking at the 5th position
		System.out.println(result);
		
		result=fib.fibonacci(10);//this is the 10th position
		System.out.println(result);
	}
}
