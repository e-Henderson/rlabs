package projectTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTestsCont {
	//continued array tests. I'm gonna make a lot of them.
	public static void main(String[] args) {
		//array of ints 
		int[] intArr = {2,5,6,8,7,59};//hardcoded array
		int[] intArr2= new int[3];//empty array but can hold three things
		
		System.out.println("Prints length of hard-coded array"+intArr.length);
		System.out.println("\nFor loop prints elements of array. ");
		for(int i :intArr)
			System.out.println(i);//just putting i prints what's inside
								//intArr 
		
		//System.out.println("\nNow moving to intArr2, which is the initialized array of 3.");
		//System.out.println("\nEnter three numbers: ");
		//Scanner scan =new Scanner(System.in);//using scanner to input
		//for(int k=0;k<intArr2.length;k++) {
			//intArr2[k]=scan.nextInt();
			//System.out.println(intArr2[k]);
			//int o =intArr2[k];
			//must print array within for loop
		//}
		//scan.close();
		System.out.println("\nVarArgs method created and called below: ");
		//varargs example called here
		varMethod(1,2,3,56,87,100);//since method is static, obj does not need to be created
		//such as ArrayTestsCont atc = new ArrayTestsCont();
		//atc.varMethod(5,7,8,455);
		System.out.println("\nforEach method stuff:");
		ArrayTestsCont atc = new ArrayTestsCont();
		atc.forEachTest();
	} 
	//varargs method created here
	public static void varMethod(int a, int...manyInts) {
		System.out.println("First int: " + a);
		System.out.println("Next int: ");
		for(int i=0;i<manyInts.length;i++) {
			System.out.println(manyInts[i]);
		}
	}
	
	//forEach method tests
	public void forEachTest() {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Maya");
		names.forEach(str -> System.out.println(str));
		/*
		 * so the line above, line 54, contains a lambda expression. 
		 * Basically, the forEach method contains a lambda expression
		 * that acts as a for loop. They are printed the exact same way. 
		 */
		
	}
}
