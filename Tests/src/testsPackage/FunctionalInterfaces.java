package testsPackage;

import java.util.function.Predicate;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		
//		Calc c =new Calc();
//		c.calculate(2);
		Square s = (int input) -> {
			return input*input;
		};
		
		int result=s.calculate(9);
		System.out.println(result);
		
		//built-in functional interfaces
		
		//Predicate
		/*
		 * public interface Predicate {
		 * 	public boolean test(T t);
		 * }
		 */
		
		//Binary Operator
		//Function
		
		Predicate<String> check = (str) -> {return str.startsWith("Mr.");};
		boolean result2 =check.test("Mr. President");
		System.out.println(result2);
	
	}
}
//class Calc implements Square {

//	@Override
//	public int calculate(int input) {
		
//		return input*input;
//	}
	
//}

interface Square {
	int calculate(int input);
}
