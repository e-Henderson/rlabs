package labRecursionAlgorithm;
/*
 * Renamed this because of the previous lab for the fibonacci lab 
 * 
 * this will calculate the factorial of a number
 */
public class ExampleOne {
	public static void main(String[] args) {
		//need dummy data
		int input =5;
		
		ExampleOne eo = new ExampleOne();
		//call methods
		System.out.println(eo.factorial(input));
	}
	
	//create your method 
	public int factorial(int num) {
		//when writing recursive alg's, you need to have a base case
		//example, 1 or 0. This will be written below 
		if (num<=0) return 0;//these two lines are the base cases
		if (num ==1) return 1;
		//the recursive call itself
		return num * factorial(num-1);
	}
}
