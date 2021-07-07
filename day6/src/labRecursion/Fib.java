package labRecursion;

public class Fib {
	public int fibonacci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		/*
		 * the above is looking at the positions of the number
		 * in the sequence.
		 * 
		 * so the above lines are comparing the positions given the 
		 * position number in the argument. Using the below recursion step,
		 * this gives the the exact number at that specific position. 
		 */
		return fibonacci(n-1) + fibonacci(n-2);//this is the recursive step
		
	}
}
