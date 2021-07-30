package examples;

import java.util.Scanner;

public class InterMain implements InterEx{
	public static void main(String[] args) {
		InterMain im = new InterMain();
		//im.eat();
		//im.drink();
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to eat or drink?");
		String input = scan.nextLine();
		im.chooseOption(input.intern());//returns the canonical value
		
		
		scan.close();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("You are eating food.");
		//return null;
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("You are drinking. ");
		//return "You are drinking.";
		//return null;
	}
	
	public void chooseOption(String option) {//some logic to decide which method to use
		//basic, basic user interface 
		if(option == "eat")
			eat();
		else if(option == "drink")
			drink();
	}

}
